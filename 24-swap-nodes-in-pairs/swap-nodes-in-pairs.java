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
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head ; 
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy ; 
        ListNode curr = head ; 
        ListNode temp = head.next ; 
        

        while(temp != null){

            ListNode next = temp.next ; 

            temp.next = null ; 
            temp.next = curr ;
            curr.next = next ; 
            prev.next = temp ; 

            prev = curr ;
            curr = prev.next ;
            if(curr != null) 
                temp = curr.next ; 
            else{
                temp = null ; 
            }
        }

        return dummy.next ; 
 
        
    }
}