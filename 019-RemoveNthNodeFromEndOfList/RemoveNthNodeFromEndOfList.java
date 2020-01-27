/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode node = head;
        do {
            stack.push(node);
            node = node.next;
        } while (node != null);

        for (int i = 0; i < n - 1; i++) {
            stack.pop();
        }

        ListNode rNode = stack.pop();
        if (!stack.isEmpty()) {
            rNode = stack.peek();
            rNode.next = rNode.next.next;
            return head;
        } else
            return rNode.next;
    }
}