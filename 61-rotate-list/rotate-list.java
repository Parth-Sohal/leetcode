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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null) return head ;
        
        int size = 0 ;
        ListNode temp = head ;
        ListNode last = null ;

        while(temp != null){
            size++;
            last = temp ;
            temp = temp.next ;
        }

        k = k % size ;
        if(k == 0 )return head ;
        

        k = size - k ;
        temp = head ;

        for(int i = 1 ; i <= k  ; i++){

            ListNode Next = temp.next ;
            temp.next = null;

            last.next = temp ;
            last = temp ;

            temp = Next ;


        }

        return temp ;


    }
}