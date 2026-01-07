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

        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oddhead = odd;
        ListNode evenHead = even;


        ListNode temp = head ;
        int count = 1;

        while(temp != null){

            if(count % 2 != 0){
                odd.next = temp;
                odd = temp;
            }

            else{
                even.next = temp;
                even = temp;
            }

            count++;
            temp = temp.next ;

        }
        evenHead = evenHead.next ;
        odd.next = evenHead ;
        even.next = null ;

        return oddhead.next ;
    


    }
}