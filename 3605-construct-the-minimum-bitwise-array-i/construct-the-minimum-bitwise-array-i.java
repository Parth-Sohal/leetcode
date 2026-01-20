class Solution {

    private int numGot(int n) {

        for (int i = 1; i < n; i++) {
            if ((i | i + 1) == n)
                return i;
        }

        return -1;

    }

    public int[] minBitwiseArray(List<Integer> nums) {

        int[] arr = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {

            arr[i] = numGot(nums.get(i));
        }

        return arr ;
    }
}