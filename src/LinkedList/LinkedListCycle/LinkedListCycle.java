package LinkedList.LinkedListCycle;

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){

            if(fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
/*
141
TC O(n)
SC o(1)
*/
