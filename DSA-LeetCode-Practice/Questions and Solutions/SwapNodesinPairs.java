class Solution {
    public ListNode swapPairs(ListNode head) {


        ListNode prev = null;
        ListNode first = head;
        
        while(first != null && first.next != null){
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;

            if (prev == null) {
                head = second;
            } else {
                prev.next = second;
            }

            prev = first;
            first = first.next;
        }

        return head;
        
    }
}