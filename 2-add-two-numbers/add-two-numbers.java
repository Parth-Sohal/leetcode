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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1) ;
        ListNode temp = dummy ; 

        int carry = 0 ;


        while(l1 != null && l2 != null){
            int sum = carry + l1.val + l2.val ; 
            ListNode newVal = new ListNode(sum % 10) ;
            temp.next = newVal ; 
            temp = temp.next ;
            carry = sum / 10 ;
            l1 = l1.next ;
            l2 = l2.next ; 
        }


        while(l1 != null ){
            int sum = carry + l1.val  ; 
            ListNode newVal = new ListNode(sum % 10) ;
            temp.next = newVal ; 
            carry = sum / 10 ;
            l1 = l1.next ;
            temp = temp.next ;
        }

        while(l2 != null ){
            int sum = carry + l2.val  ; 
            ListNode newVal = new ListNode(sum % 10) ;
            temp.next = newVal ; 
            carry = sum / 10 ;
            l2 = l2.next ;
            temp = temp.next ;
        }

        while(carry  != 0 ){
            ListNode newVal = new ListNode(carry % 10) ;
            temp.next = newVal ; 
            carry = carry / 10 ;
            temp = temp.next ;
        }


        return dummy.next ; 

        
    }
}