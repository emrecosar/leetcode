/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = null;
        ListNode head = null;
        int carry = 0;
        int val;
        while (l1 != null && l2 != null) {

            int currentSum = l1.val + l2.val + carry;
            val = currentSum % 10;
            carry = currentSum / 10;

            ListNode node = new ListNode(val);
            if (current == null) {
                current = node;
                head = current;
            } else {
                current.next = node;
                current = node;
            }
            l1 = l1.next;
            l2 = l2.next;

        }

        while (l1 != null) {

            int currentSum = l1.val + carry;
            val = currentSum % 10;
            carry = currentSum / 10;

            ListNode node = new ListNode(val);
            current.next = node;
            current = node;
            l1 = l1.next;
        }

        while (l2 != null) {

            int currentSum = l2.val + carry;
            val = currentSum % 10;
            carry = currentSum / 10;

            ListNode node = new ListNode(val);
            current.next = node;
            current = node;
            l2 = l2.next;
        }

        if(carry != 0) {
            ListNode node = new ListNode(carry);
            current.next = node;
        }

        return head;

    }
}