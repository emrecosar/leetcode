public class LinkedListCycle

        public boolean hasCycle(ListNode head) {

            if (head == null)
                return false;

            ListNode oneStep = head;
            ListNode twoStep = head;

            while (oneStep.next != null && twoStep.next.next != null) {
                oneStep = oneStep.next;
                twoStep = twoStep.next.next;
                if (oneStep == twoStep) return true;
                if (oneStep == null || twoStep == null || twoStep.next == null) break;
            }

            return false;
        }
}