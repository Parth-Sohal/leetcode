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

    public ListNode reverse(ListNode prev , ListNode curr){

        if(curr == null ){
            return prev ;
        }

        ListNode prev1 = curr ;
        ListNode next1 = curr.next ;

        curr.next = prev ; 
        return reverse(prev1 , next1) ;
    }

    public ListNode reverseList(ListNode head) {
        return reverse(null , head);
    }
}