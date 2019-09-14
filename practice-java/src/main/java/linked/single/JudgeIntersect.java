package linked.single;

import common.MyUtils;
import common.Structure.Node;

/**
 * @anthor LingChen
 * @create 9/13/2019 2:43 PM
 * @Description 判断两个链表是否相交，相交则返回交点
 */
public class JudgeIntersect {

    public static Node getIntersectPoint(Node head1, Node head2) {
        Node loopPoint1 = JudgeLoop.getLoopPoint(head1);
        Node loopPoint2 = JudgeLoop.getLoopPoint(head2);
        Node result = null;
        // 如果都没环，一起跑到最后，判断最后是否一样
        if (loopPoint1 == null && loopPoint2 == null) {
            result = judgeWithoutLoop(head1, head2);
        }
        // 如果都有环，分入环点一样，还是不一样
        if (loopPoint1 != null && loopPoint2 != null) {
            if (loopPoint1 == loopPoint2) {
                Node temp1 = loopPoint1.next;
                Node temp2 = loopPoint2.next;
                loopPoint1.next = null;
                loopPoint2.next = null;
                result = judgeWithoutLoop(head1, head2);
                loopPoint1.next = temp1;
                loopPoint2.next = temp2;
            } else {
                Node begin = loopPoint1;
                loopPoint1 = loopPoint1.next;
                while (loopPoint1 != begin) {
                    if (loopPoint1 == loopPoint2) {
                        result = begin;
                        break;
                    }
                    loopPoint1 = loopPoint1.next;
                }
            }
        }
        return result;
    }

    public static Node judgeWithoutLoop(Node head1, Node head2) {
        return getPonitWithoutLoop(getTailAndLength(head1), getTailAndLength(head2));
    }

    public static Object[] getTailAndLength(Node head) {
        Node curr = head;
        Integer len = 0;
        while (curr.next != null && curr != null) {
            curr = curr.next;
            len++;
        }
        if (curr != null) {
            len++;
        }
        return new Object[]{head, curr, len};
    }

    public static Node getPonitWithoutLoop(Object[] nodelist1, Object[] nodelist2) {
        Node result = null;
        Node head1 = (Node) nodelist1[0];
        Node tail1 = (Node) nodelist1[1];
        int len1 = (int) nodelist1[2];
        Node head2 = (Node) nodelist2[0];
        Node tail2 = (Node) nodelist2[1];
        int len2 = (int) nodelist2[2];
        if (tail1 == tail2) {
            if (len1 < len2) {
                int len = len2 - len1;
                while (len > 0) {
                    head2 = head2.next;
                    len--;
                }
            } else {
                int len = len1 - len2;
                while (len > 0) {
                    head1 = head1.next;
                    len--;
                }
            }
            while (head1 != head2) {
                head1 = head1.next;
                head2 = head2.next;
            }
            result = head1;
        }
        return result;
    }


    public static void main(String[] args) {
        Node[] nodes = MyUtils.genTwoLoopIntersectNodeList(false);
        Node head1 = nodes[0], head2 = nodes[1];
        MyUtils.printNodeList(head1);
        MyUtils.printNodeList(head2);
        MyUtils.printNode(getIntersectPoint(head1, head2));

    }
}
