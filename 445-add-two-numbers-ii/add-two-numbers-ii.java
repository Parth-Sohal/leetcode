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

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        ListNode temp = l1;

        while (temp != null) {
            st1.push(temp.val);
            temp = temp.next;
        }

        temp = l2;

        while (temp != null) {
            st2.push(temp.val);
            temp = temp.next;
        }


        ListNode prev = null;
        ListNode head = null ;
        int carry = 0 ;
        
        while(!st1.isEmpty() && !st2.isEmpty()){

            int sum = st1.pop() + st2.pop() + carry ;
            carry = sum / 10 ;
            ListNode a = new ListNode(sum % 10);
            head = a ;
            head.next = prev ;
            prev = head;
            
        }

        while(!st1.isEmpty()){

            int sum = st1.pop() + carry ;
            carry = sum / 10 ;
            ListNode a = new ListNode(sum % 10);
            head = a ;
            head.next = prev ;
            prev = head;
            
        }

        while(!st2.isEmpty()){

            int sum = st2.pop() + carry ;
            carry = sum / 10 ;
            ListNode a = new ListNode(sum % 10);
            head = a ;
            head.next = prev ;
            prev = head;
            
        }

        if(carry != 0){
            ListNode a = new ListNode(carry);
            head = a ;
            head.next = prev ;
        }

        return head ;




    }
}