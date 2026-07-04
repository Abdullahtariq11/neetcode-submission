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
        ListNode temp=head;
        int index=0;
        HashMap<ListNode,Integer> hashSet=new HashMap<>();
        while(temp!=null){
            if(hashSet.containsKey(temp)){
                return true;
            }
            else{
                hashSet.put(temp,index);
                index++;
            }
            temp=temp.next;
        }
        return false;
        
    }
}
