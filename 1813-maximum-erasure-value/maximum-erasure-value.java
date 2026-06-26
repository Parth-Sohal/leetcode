class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            sum += n;

            if (map.containsKey(n)) {

                int prevIdx = map.get(n);

                while (start <= prevIdx) {
                    sum -= nums[start];
                    start++;
                }

            }

            max = Math.max(max, sum);

            map.put(n, i);

        }

        return max ; 

    }
}