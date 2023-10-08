package LinkedList.ReverseLinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}
/*
206
TC O(n)
SC O(1)
 */
