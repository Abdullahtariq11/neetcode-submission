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
        ListNode temp= head;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        int length=0;

        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int k=length-n;
        temp=dummy;

        for (int i=0;i<k;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next; 
           

        return dummy.next;


    }
}
