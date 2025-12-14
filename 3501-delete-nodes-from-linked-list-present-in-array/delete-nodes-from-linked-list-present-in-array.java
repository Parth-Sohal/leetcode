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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy ;

        ListNode temp = head ;
        while(temp != null){

            if(!set.contains(temp.val)){
                prev.next = temp;
                prev = temp ;
            }

            temp = temp.next ;

        }

        prev.next = null ;
        return dummy.next ; 



    }
}