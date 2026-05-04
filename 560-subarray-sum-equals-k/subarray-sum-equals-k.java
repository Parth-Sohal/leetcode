class Solution {
    public int subarraySum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int ans = 0;
        int sum = 0;

        for (int i : arr) {

            sum += i;

            if (map.containsKey(sum - target)) {
                ans += map.get(sum - target);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return ans ; 

    }
}