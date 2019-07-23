/**
 * @program: fresh-algorithms
 * @Date: 2019/7/22 22:34
 * @Author: Ling Chen
 * @Description:
 */
public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;
        ListNode current = result;
        int carry = 0;
        while (listNode1 != null || listNode2 != null) {
            int num1 = (listNode1 != null) ? listNode1.val : 0;
            int num2 = (listNode1 != null) ? listNode1.val : 0;
            int sum = carry + num1 + num2;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (listNode1 !=null){
                listNode1 = listNode2.next;
            }
            if (listNode2 !=null){
                listNode2 = listNode2.next;
            }
        }
        if (carry > 0){
            current.next = new ListNode(carry);
        }
        return result.next;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
