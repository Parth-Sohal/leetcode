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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = new int[2];
        Arrays.fill(ans,-1);

        ListNode prev = head ;
        ListNode curr = head.next ;

        int first = -1;
        int last = -1 ; 
        int next = -1;

        int post = 2 ;

        int minDist = Integer.MAX_VALUE ;
        // int maxDist = Integer.MAX_VALUE ;
        
        while(curr.next != null ){

            int a = prev.val ;
            int b = curr.val ; 
            int c = curr.next.val ; 



            if( (a > b && b < c) || ( a < b  && b > c ) ){

                if(first == -1){
                    first = post ;
                }

                last = next ;
                next = post ; 


                if(last != -1){
                    minDist = Math.min(minDist , next - last);
                }

            }

            post++;
            prev = prev.next ;
            curr = curr.next ; 

        }

        if(last == -1){
            return ans ;
        }

        ans[0] = minDist ; 
        ans[1] = next - first ;


        return ans ; 
        
    }
}