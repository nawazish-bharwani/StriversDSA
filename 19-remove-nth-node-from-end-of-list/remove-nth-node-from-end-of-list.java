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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = getLLLength(head);
        if(n==length) {
            head = head.next;
            temp.next = null;
            return head;
        }
        int count = length-n-1; //-1 as temp - head which is 1st node
        while (count>0) {
            count--;
            temp=temp.next;
        }
        if(temp.next.next == null) {
            temp.next=null;
            return head;
        } else {
            temp.next = temp.next.next;
        }
        return head;
    }
    static int getLLLength(ListNode head) {
        ListNode pointer = head;
        int count=0;
        while(pointer!=null) {
            count++;
            pointer=pointer.next;
        }
        return count;
    }
}