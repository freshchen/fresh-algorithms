package linked;

import common.MyUtils;
import common.Node;

/**
 * @anthor LingChen
 * @create 9/12/2019 3:37 PM
 * @Description
 */
public class ReverseNode {

    public static Node reverse(Node head) {
        Node curr = head;
        Node result = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = result;
            result = curr;
            curr = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        Node head = MyUtils.getRandowIntegerNode(6);
        MyUtils.printNode(head);
        MyUtils.printNode(reverse(head));
    }
}
