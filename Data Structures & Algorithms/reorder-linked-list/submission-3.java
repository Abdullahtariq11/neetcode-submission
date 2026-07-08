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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int mid = size / 2;
        ListNode fast = head;
        int length = 0;
        
        while (length < mid) {
            fast = fast.next;
            length++;
        }

        ListNode secondStart = fast.next;
        fast.next = null; 

        ListNode secondHalf = null;
        ListNode curr = secondStart;
        while (curr != null) {
            ListNode nextTmp = curr.next;
            curr.next = secondHalf;
            secondHalf = curr;
            curr = nextTmp;
        }

      
        current = head;
        while (current != null && secondHalf != null) {
            ListNode temp1 = current.next;   
            ListNode temp2 = secondHalf.next; 

            current.next = secondHalf;        
            secondHalf.next = temp1;          

            current = temp1;                  
            secondHalf = temp2;               
        }
    }
}
