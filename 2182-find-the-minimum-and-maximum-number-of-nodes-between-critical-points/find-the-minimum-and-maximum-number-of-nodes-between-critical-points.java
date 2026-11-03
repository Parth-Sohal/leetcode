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

        if(head.next == null || head.next.next == null){
            return new int[]{-1,-1};
        }

        int firstPost = -1; 
        int lastPost =  -1; 


        int minDist = Integer.MAX_VALUE  ; 

        int idx = 1 ; 

        ListNode prev = head ;
        ListNode curr = head.next ; 


        while(curr.next != null){

            if((curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val)){

                if(firstPost == -1){
                    firstPost = idx;
                }
                else{
                    minDist = Math.min(minDist , idx - lastPost);
                }

                lastPost = idx ;
    
            }


            idx++;
            
            prev = curr ; 
            curr = curr.next ; 

        } 

        if(firstPost == -1 || lastPost == firstPost){
            return new int[]{-1,-1};
        }


        return new int[]{minDist , lastPost - firstPost};


    }
}