class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int max = 1;

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i] - 1))
                continue;

            else {

                int count = 0;
                int n = nums[i];
                while (set.contains(n)) {
                    count++;
                    set.remove(n);
                    n = n + 1;
                }

                max = Math.max(max, count);

            }

        }

        return max;
        
    }
}