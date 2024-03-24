/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        if(list1 == null && list2 == null) {
            return head;
        }
        if(list1 == null && list2!=null) {
            return list2;
        }
        if(list2 == null && list1!=null) {
            return list1;
        }
        ListNode temp=head;
        if(list1.val <= list2.val) {
            head = temp = list1;
            list1=list1.next;
        } else {
            head = temp = list2;
            list2=list2.next;
        }
        while(list1!=null && list2!=null) {
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1=list1.next;
            } else {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        while(list1!=null) {
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }
        while(list2!=null) {
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        return head;
    }
}