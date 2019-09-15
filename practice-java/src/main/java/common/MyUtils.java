package common;

import common.Structure.Node;
import common.Structure.TreeNode;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/8 23:02
 * @Author: Ling Chen
 * @Description:
 */
public class MyUtils {

    private static int[] arr = null;
    private static int[][] matrix = null;

    public static void randomMatrix() {
        int size = 5;
        int maxValue = 20;
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = randomInt(maxValue);
            }
        }
    }

    public static int[][] genMatrix() {
        int[][] copy = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return copy;
    }

    public static void prinMatrix(int[][] matrix) {
        System.out.println("Current matrix is :");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    public static void randomArray() {
        int size = 20;
        int maxValue = 20;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = randomInt(maxValue);
        }
    }

    public static int[] genArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] arr, int fromIndex, int toIndex) {
        int temp = arr[fromIndex];
        arr[fromIndex] = arr[toIndex];
        arr[toIndex] = temp;
    }


    public static int randomInt(int max) {
        return (int) (((max + 1) * Math.random()) - ((max) * Math.random()));
    }

    public static Node genNodeList() {
        Node<Integer> head = new Node<>(1);
        Node<Integer> l1 = new Node<>(2);
        Node<Integer> l2 = new Node<>(3);
        Node<Integer> l3 = new Node<>(4);
        Node<Integer> l4 = new Node<>(5);
        Node<Integer> l5 = new Node<>(6);
        Node<Integer> l6 = new Node<>(7);
        Node<Integer> l7 = new Node<>(8);
        head.next = l1;
        head.next.next = l2;
        head.next.next.next = l3;
        head.next.next.next.next = l4;
        head.next.next.next.next.next = l5;
        head.next.next.next.next.next.next = l6;
        head.next.next.next.next.next.next.next = l7;
        head.next.next.next.next.next.next.next.next = null;

        return head;
    }

    public static Node genLoopNodeList() {
        Node<Integer> head = new Node<>(1);
        Node<Integer> l1 = new Node<>(2);
        Node<Integer> l2 = new Node<>(3);
        Node<Integer> l3 = new Node<>(4);
        Node<Integer> l4 = new Node<>(5);
        Node<Integer> l5 = new Node<>(6);
        Node<Integer> l6 = new Node<>(7);
        Node<Integer> l7 = new Node<>(8);
        head.next = l1;
        head.next.next = l2;
        head.next.next.next = l3;
        head.next.next.next.next = l4;
        head.next.next.next.next.next = l5;
        head.next.next.next.next.next.next = l6;
        head.next.next.next.next.next.next.next = l7;
        head.next.next.next.next.next.next.next.next = l5;

        return head;
    }

    public static Node[] genTwoIntersectNodeList() {
        Node<Integer> head = new Node<>(1);
        Node<Integer> l1 = new Node<>(2);
        Node<Integer> l2 = new Node<>(3);
        Node<Integer> l3 = new Node<>(4);
        Node<Integer> l4 = new Node<>(5);
        Node<Integer> l5 = new Node<>(6);
        Node<Integer> l6 = new Node<>(7);
        Node<Integer> l7 = new Node<>(8);
        Node<Integer> head2 = new Node<>(9);
        Node<Integer> l21 = new Node<>(10);
        Node<Integer> l22 = new Node<>(11);
        Node<Integer> l23 = new Node<>(12);
        head.next = l1;
        head.next.next = l2;
        head.next.next.next = l3;
        head.next.next.next.next = l4;
        head.next.next.next.next.next = l5;
        head.next.next.next.next.next.next = l6;
        head.next.next.next.next.next.next.next = l7;
        head.next.next.next.next.next.next.next.next = null;
        head2.next = l21;
        head2.next.next = l22;
        head2.next.next.next = l23;
        head2.next.next.next.next = l6;

        return new Node[]{head, head2};
    }

    /**
     * flag为true返回两个入环节点一样的环，否则返回入环点不一样的
     *
     * @param flag
     * @return
     */
    public static Node[] genTwoLoopIntersectNodeList(boolean flag) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> l1 = new Node<>(2);
        Node<Integer> l2 = new Node<>(3);
        Node<Integer> l3 = new Node<>(4);
        Node<Integer> l4 = new Node<>(5);
        Node<Integer> l5 = new Node<>(6);
        Node<Integer> l6 = new Node<>(7);
        Node<Integer> l7 = new Node<>(8);
        Node<Integer> head2 = new Node<>(9);
        Node<Integer> l21 = new Node<>(10);
        Node<Integer> l22 = new Node<>(11);
        Node<Integer> l23 = new Node<>(12);
        head.next = l1;
        head.next.next = l2;
        head.next.next.next = l3;
        head.next.next.next.next = l4;
        head.next.next.next.next.next = l5;
        head.next.next.next.next.next.next = l6;
        head.next.next.next.next.next.next.next = l7;
        head.next.next.next.next.next.next.next.next = l5;
        head2.next = l21;
        head2.next.next = l22;
        head2.next.next.next = l23;
        if (flag) {
            head2.next.next.next.next = l5;
        } else {
            head2.next.next.next.next = l6;
        }
        return new Node[]{head, head2};
    }

    public static void printNode(Node node) {
        if (node == null) {
            System.out.println("This node is null");
        } else {
            System.out.println("Data is : " + node.data);
        }
    }

    public static void printNodeList(Node head) {
        int max = 0;
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
            max++;
            if (max == 20) {
                break;
            }
        }
        String end = max == 20 ? "loop" : "null";
        System.out.print(end);
        System.out.println();
    }

    public static TreeNode genBinaryTree() {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> t1 = new TreeNode<>(2);
        TreeNode<Integer> t2 = new TreeNode<>(3);
        TreeNode<Integer> t3 = new TreeNode<>(4);
        TreeNode<Integer> t4 = new TreeNode<>(5);
        TreeNode<Integer> t5 = new TreeNode<>(6);
        TreeNode<Integer> t6 = new TreeNode<>(7);
        TreeNode<Integer> t7 = new TreeNode<>(8);
        TreeNode<Integer> t8 = new TreeNode<>(9);
        TreeNode<Integer> t9 = new TreeNode<>(10);
        TreeNode<Integer> t10 = new TreeNode<>(11);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.left = t5;
        t2.right = t6;
        t3.left = t7;
        t3.right = t8;
        t4.left = t9;
        t4.right = t10;
        root.parent = null;
        t1.parent = root;
        t2.parent = root;
        t3.parent = t1;
        t4.parent = t1;
        t5.parent = t2;
        t6.parent = t2;
        t7.parent = t3;
        t8.parent = t3;
        t9.parent = t4;
        t10.parent = t4;

        return root;
    }

    /**
     * 可以任务组合生成独立的哈希函数
     */
    public static int defineHash(Object obj) {
        return obj.hashCode() >> 2 + obj.hashCode() ^ 2;
    }
}