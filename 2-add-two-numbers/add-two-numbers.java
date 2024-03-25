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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode curr=ans;
        int carry=0;
        while (l1!=null || l2!=null) {
            int sum=0;
            if(l1!=null) {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node = new ListNode(sum%10);
            curr.next=node;
            curr=curr.next;
        }
        if(carry!=0) {
            ListNode node = new ListNode(carry);
            curr.next=node;
        }
        return ans.next;
    }
}