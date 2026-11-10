class Solution {
    public int atMostK(int[] nums, int k) {

        if (k <= 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0, n = nums.length, ans = 0;

        for (int end = 0; end < n; end++) {

            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            while (map.size() > k) {

                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }
                start++;

            }

            ans += (end - start + 1);

        }

        return ans;

    }

    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMostK(nums, k) - atMostK(nums, k - 1);

    }
}