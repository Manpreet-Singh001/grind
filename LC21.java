public class LC21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode handler = head;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                handler.next = list1;
                list1 = list1.next;
            }else{
                handler.next = list2;
                list2 = list2.next;
            }
            handler = handler.next;
        }
        if(list1 != null){
            handler.next = list1;
        }
        if(list2 != null){
            handler.next = list2;
        }
        return head.next;

    }
}
