/**
 * @program: fresh-algorithms
 * @Date: 2019/7/23 20:56
 * @Author: Ling Chen
 * @Description:
 */
public class Q206 {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode result = null;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = result;
            result = current;
            current = nextNode;
        }
        return result;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
