class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int ans = 0, n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        int start = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.size() >= set.size()) {

                ans += n - i;

                map.put(nums[start], map.get(nums[start]) - 1);

                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }
                start++;
            }

        }

        return ans;
    }
}