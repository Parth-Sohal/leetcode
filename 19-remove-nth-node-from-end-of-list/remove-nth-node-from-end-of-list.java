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

        if(head.next == null){
            return null ;
        }


        // fast i will take at n + 1 steps 
        // then slow and fast move together     

        ListNode fast = head ; 
        ListNode slow = head ; 

        for(int i = 0 ; i <= n - 1  ; i++){
            fast = fast.next ; 
        }

        if(fast == null){
            return head.next ; 
        }

        while(fast.next != null){
            slow = slow.next ; 
            fast = fast.next ; 
        }


        slow.next = slow.next.next ; 

        return head ;

    }
}