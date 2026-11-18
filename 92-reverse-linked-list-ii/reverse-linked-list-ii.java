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
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int l, int r) {
        if (head == null || l == r) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;

        for (int i = 0; i < l - 1; i++) {
            left = left.next;
        }

        for (int i = 0; i < r; i++) {
            right = right.next;
        }

        ListNode next = right.next;
        right.next = null;

        ListNode temp = left.next;

        ListNode reverseNode = reverse(temp);

        left.next = reverseNode;
        temp.next = next;

        return dummy.next;
    }
}