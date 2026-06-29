class Solution {

    public int helper(int[] nums, int k) {

        if (k == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int total = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];

            map.put(n, map.getOrDefault(n, 0) + 1);

            while (map.size() > k) {

                map.put(nums[start], map.get(nums[start]) - 1);

                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }

                start++;

            }

            total += (i - start + 1);

        }

        return total ; 

    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1) ;
    }
}