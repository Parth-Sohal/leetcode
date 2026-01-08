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
        ListNode temp = head;

        while (temp != null) {

            ListNode Next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = Next;

        }

        return prev;

    }

    public int[] nextLargerNodes(ListNode head) {

        head = reverse(head);

        Stack<Integer> st = new Stack<>();

        int size = 0;
        ListNode temp = head;

        while (temp != null) {

            int data = temp.val;

            if (st.isEmpty()) {
                temp.val = 0;
            } else {
                while (!st.isEmpty() && data >= st.peek()) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    temp.val = 0;
                } else {
                    temp.val = st.peek();
                }
            }

            st.push(data);
            size++;
            temp = temp.next;

        }

        int[] arr = new int[size];

        temp = head;
        int i = 0;

        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }

        i = 0;
        int j = size - 1;

        while (i < j) {
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
            i++;
            j--;
        }

        return arr;

    }
}