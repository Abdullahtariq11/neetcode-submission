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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        HashMap<ListNode,Integer> hashSet=new HashMap<>();
        while(slow!=null &&fast!=null && fast.next!=null){
            fast=fast.next;
            if(fast==slow){
                return true;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return false;
        
    }
}
