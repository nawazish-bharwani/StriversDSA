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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode node = head;
        while(curr!=null && curr.next!=null) {
            while(curr.next!=null && curr.val == curr.next.val) {
                curr=curr.next;
            }
            node.next=curr.next;
            if(curr.next!=null) {
            curr=curr.next;
            node=curr;
            }
        }
        return head;
    }
}