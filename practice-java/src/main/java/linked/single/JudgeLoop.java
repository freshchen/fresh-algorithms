package linked.single;

import common.MyUtils;
import common.Structure.Node;

/**
 * @anthor LingChen
 * @create 9/13/2019 1:56 PM
 * @Description 判断单链表是否有还，有的话返回入环节点
 */
public class JudgeLoop {

    public static Node getLoopPoint(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                break;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        return fast;
    }

    public static void main(String[] args) {
        Node head = MyUtils.genLoopNodeList();
        MyUtils.printNodeList(head);
        MyUtils.printNode(JudgeLoop.getLoopPoint(head));
    }
}
