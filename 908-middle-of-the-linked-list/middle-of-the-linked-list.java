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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!= null) {
            temp=temp.next;
            count++;
        }
        temp=head;
        int counter=count/2;
        while(counter>0) {
            temp=temp.next;
            counter--;
        }
        return temp;
    }
}