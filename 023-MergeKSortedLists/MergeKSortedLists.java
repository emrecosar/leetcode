/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        ListNode tail = new ListNode(Integer.MIN_VALUE);
        dummyHead.next = tail;

        while (true) {
            int count = 0;

            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {

                ListNode current = lists[i];
                if (current == null) {
                    count++;
                    continue;
                }

                if (min >= current.val) {
                    min = current.val;
                    minIndex = i;
                }
            }

            if (count == lists.length)
                break;

            ListNode current = lists[minIndex];
            if (current.val >= tail.val) {
                tail.next = new ListNode(current.val);
                tail = tail.next;
                lists[minIndex] = current.next;
            }
        }

        return dummyHead.next.next;
    }
}