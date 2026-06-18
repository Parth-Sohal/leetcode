class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.pollLast();
            }
            q.addLast(i);
        }
        // System.out.println(q);

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(nums[q.peekFirst()]);

        // System.out.println(ans);

        for (int i = k; i < nums.length; i++) {

            if (i - q.peekFirst() >= k) {
                q.pollFirst();
            }

            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.pollLast();
            }

            q.addLast(i);

            ans.add(nums[q.peekFirst()]);

        }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}