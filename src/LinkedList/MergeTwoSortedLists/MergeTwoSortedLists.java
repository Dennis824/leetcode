package LinkedList.MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if(list1 != null) {
            curr.next = list1;
            list1 = list1.next;
        }
        if(list2 != null){
            curr.next = list2;
            list2 = list2.next;
        }
        return temp.next;
    }
}
/*
21
TC O(n)
SC O(1)
 */

