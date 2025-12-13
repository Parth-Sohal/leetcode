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
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode limit = slow;


        ListNode prev = null;
        while (limit != null) {
            ListNode next = limit.next;
            limit.next = prev;
            prev = limit;
            limit = next;
        }

        ListNode newHead = prev;
        ListNode temp = head;

        while (newHead != null && temp != slow) {
            if (newHead.val != temp.val) {
                return false ;
            }
            
            newHead = newHead.next;
            temp = temp.next;
        }

        return true ;

    }
}