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
    public int getDecimalValue(ListNode head) {
        ListNode newHead = revList(head);
        int pow=0;
        int ans=0;
        ListNode temp = newHead;
        while(temp!=null) {
            if(temp.val == 1) {
            int res = (int)(Math.pow(2,pow));
            ans+=res;
            }
            pow++;
            temp=temp.next;
        }
        return ans;
    }
    static ListNode revList(ListNode head) {
        ListNode node=null;
        while(head!=null) {
            ListNode temp=head;
            head=head.next;
            temp.next=node;
            node=temp;
        }
        return node;
    }
}