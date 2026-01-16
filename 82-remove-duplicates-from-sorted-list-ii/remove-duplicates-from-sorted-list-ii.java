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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null)return head ;

        ListNode dummy = new ListNode(-1) ;
        ListNode newHead = dummy ;

        ListNode temp = head ;

        while(temp != null){

            ListNode curr = temp ;
            int count = 0 ;

            while( curr != null && curr.val == temp.val){
                count++;
                curr = curr.next ;
            }

            if(count == 1){
                dummy.next = temp;
                dummy = temp ;
            }

            if(curr == null) break ;

            temp = curr ;
        }

        dummy.next = null ;

        return newHead.next ;
        
    }
}