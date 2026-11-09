class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n-k+1];

        Deque<Integer> dq = new LinkedList<>();
        int idx = 0;

        for (int i = 0; i < k; i++) {

            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.add(i);

        }


        arr[idx++] = nums[dq.peekFirst()];

        for (int i = k; i < n; i++) {


            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.add(i);

            if (dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            arr[idx++] = nums[dq.peekFirst()];



        }

        return arr;

    }
}