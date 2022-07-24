public class LC206 {
    public ListNode reverseList(ListNode head) {

        if (head == null) return head;

        ListNode newHead = null;
        while (head != null) {
            ListNode actualNext = head.next;
            head.next = newHead;
            newHead = head;
            head = actualNext;

        }
        return newHead;
    }
}
