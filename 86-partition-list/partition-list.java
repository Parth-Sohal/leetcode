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
    public ListNode partition(ListNode head, int x) {

        if(head == null || head.next == null){
            return head ; 
        }
        
        ListNode dummySmall = new ListNode(-1);
        ListNode dummyBig = new ListNode(-1);
        ListNode small = dummySmall ; 
        ListNode large = dummyBig ;

        ListNode curr = head ;

        while(curr != null){

            if(curr.val < x){
                small.next = curr;
                small = small.next ;
            }
            else{
                large.next = curr;
                large = large.next ; 
            }

            curr = curr.next ;

        }

        large.next = null ;
        dummyBig = dummyBig.next ; 
        small.next = dummyBig ; 

        return dummySmall.next ; 



    }
}