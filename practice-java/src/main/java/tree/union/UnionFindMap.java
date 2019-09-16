package tree.union;

import common.Structure.Union;

import java.util.*;

/**
 * @anthor LingChen
 * @create 9/16/2019 3:41 PM
 * @Description 使用Map实现并查集，单次查询和合并复杂度 O（1）
 */
public class UnionFindMap {

    public static HashMap<Union, Union> parentMap = new HashMap<>();
    public static HashMap<Union, Integer> sizeMap = new HashMap<>();

    public static void init(List<Union> unions) {
        for (Union union : unions) {
            parentMap.put(union, union);
            sizeMap.put(union, 1);
        }
    }

    /**
     * 当前节点向上找并查集代表节点，然后把途经的节点全都扁平化，连接到代表节点
     *
     * @param union
     * @return
     */
    public static Union findHead(Union union) {
        Stack<Union> stack = new Stack<>();
        Union curr = union;
        while (curr != parentMap.get(curr)) {
            stack.push(curr);
            curr = parentMap.get(curr);
        }
        while (!stack.isEmpty()) {
            parentMap.put(stack.pop(), curr);
        }
        return curr;
    }

    public static boolean isSameUnion(Union union1, Union union2) {
        return findHead(union1) == findHead(union2);
    }

    /**
     * 短的加到长的下
     *
     * @param union1
     * @param union2
     */
    public static void union(Union union1, Union union2) {
        if (union1 == null || union2 == null) {
            return;
        }
        Union head1 = findHead(union1);
        Union head2 = findHead(union2);
        if (head1 != head2) {
            int size1 = sizeMap.get(head1);
            int size2 = sizeMap.get(head2);
            if (size2 > size1) {
                parentMap.put(head1, head2);
                sizeMap.put(head2, size1 + size2);
                sizeMap.remove(head1);
            } else {
                parentMap.put(head2, head1);
                sizeMap.put(head1, size1 + size2);
                sizeMap.remove(head2);
            }
        }
    }

    public static void main(String[] args) {
        Union<String> union1 = new Union<>("dong");
        Union<String> union2 = new Union<>("xi");
        Union<String> union3 = new Union<>("nan");
        init(Arrays.asList(union1, union2, union3));

        System.out.println(isSameUnion(union1, union2));
        union(union1, union2);
        System.out.println(isSameUnion(union1, union2));

        System.out.println(isSameUnion(union1, union3));
        union(union1, union3);
        System.out.println(isSameUnion(union1, union3));

        System.out.println(isSameUnion(union2, union3));

    }

}
