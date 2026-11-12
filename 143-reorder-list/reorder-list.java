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
    public void reorderList(ListNode head) {

        Stack<ListNode> st = new Stack<>() ;
        ListNode curr = head ;

        while(curr != null){
            st.push(curr);
            curr = curr.next ;
        }

        int n = st.size() ;
     
        curr = head ;

        while(st.size() > (n+1)/2){

            // need 
            ListNode temp = st.pop();
            ListNode next = curr.next ; 

            // operations 
            curr.next = temp ;
            temp.next = next ; 

            // next iterations 
            curr = next ; 


        }

        curr.next = null ; 
        
    }
}