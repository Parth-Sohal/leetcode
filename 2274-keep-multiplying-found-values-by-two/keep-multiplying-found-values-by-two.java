class Solution {

    public int findFinalValue(int[] nums, int original) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        int current = original;

        while (mpp.containsKey(current)) {
            current = current * 2;
        }

        return current ;
    }
}