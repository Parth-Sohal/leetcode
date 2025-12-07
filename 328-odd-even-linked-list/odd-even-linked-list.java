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
    public ListNode oddEvenList(ListNode head) {

        if(head == null){
            return head; 
        }

        ListNode odd = head;
        ListNode even = odd.next;
        ListNode temp = even;

        while (even != null && even.next != null) {
            ListNode nextOdd = even.next;
            ListNode nextEven = nextOdd.next;

            odd.next = nextOdd;
            even.next = nextEven;

            odd = nextOdd;
            even = nextEven;

        }

        odd.next = temp;
        return head; 
    }
}