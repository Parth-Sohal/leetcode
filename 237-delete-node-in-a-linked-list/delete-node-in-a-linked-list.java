/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {


        ListNode temp = node ; 
        
        while(temp != null){

            temp.val = temp.next.val ;
            ListNode Next = temp.next ;
            if(Next.next == null){
                temp.next = null;
                break;
            }

            temp = temp.next ;

        }
        
    }
}