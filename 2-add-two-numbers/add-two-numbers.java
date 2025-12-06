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

        ListNode a = l1;
        ListNode b = l2 ;
        int carry = 0 ;

        int tsum = a.val + b.val ;
        ListNode head  = new ListNode( tsum % 10) ;
        ListNode tail = head ;
        carry = tsum / 10 ;
        a = a.next ;
        b = b.next ;

        while(a != null && b != null){
            int sum = a.val + b.val + carry;
            int mod = sum % 10 ;
            ListNode temp = new ListNode(mod);
            tail.next = temp ;
            tail = tail.next ;
            carry = sum / 10;
            a = a.next;
            b = b.next;
        }

        while(a != null){
            int sum   = a.val + carry;
            int mod = sum % 10;
            ListNode temp = new ListNode(mod);
            tail.next = temp ;
            tail = tail.next ;
            carry = sum / 10;
            a = a.next;
        }

        while(b != null){
            int sum = b.val + carry;
            int mod = sum % 10;
            ListNode temp = new ListNode(mod);
            tail.next = temp ;
            tail = tail.next ;
            carry = sum / 10;
            b = b.next;
        }

        while(carry > 0){
            ListNode temp = new ListNode(carry % 10);
            tail.next = temp ;
            tail = tail.next ;
            carry = carry/10;
        }

        return head ;
        
    }
}