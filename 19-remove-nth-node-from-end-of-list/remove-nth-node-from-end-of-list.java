/**
 * Definition for singly-linked 
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
        
        ListNode temp = head ;
        int size = 0 ;

        while (temp != null){

            size++;
            temp = temp.next;

        }

        n = size - n ;

        if(n == 0){
            head =  head.next;
            return head ;
        }

        temp = head ;

        for(int i = 1 ; i < n  ; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next ;

        return head ; 

    }
}