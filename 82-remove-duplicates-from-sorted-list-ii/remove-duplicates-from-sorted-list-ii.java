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

    // recursive 

    public ListNode delete(ListNode curr) {

        if (curr == null || curr.next == null) {
            return curr;
        }

        ListNode temp = curr;
        ListNode next = temp.next;

        ListNode newHead = delete(next);

        if (temp.val != next.val) {
            temp.next = newHead;
            return temp;
        }

        if ((temp.val == next.val) && newHead != null  && temp.val == newHead.val) {
            newHead = newHead.next;
        }

        return newHead;

    }

    

    public ListNode deleteDuplicates(ListNode head) {
        return delete(head);
    }
}