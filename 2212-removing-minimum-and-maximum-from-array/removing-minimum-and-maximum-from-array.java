class Solution {
    public int minimumDeletions(int[] nums) {

        int minIdx = 0;
        int maxIdx = 0;

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }

            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }

        }



        // 3 ways

        // first way

        int allFromLeft = Math.max(minIdx, maxIdx) + 1;

        int allFromRight = n - Math.min(minIdx, maxIdx);

        int fromLeftAndFromRight = Math.min(minIdx, maxIdx) + 1 +  (n - Math.max(minIdx, maxIdx)) ;

        int ans = Math.min(allFromLeft, Math.min(allFromRight, fromLeftAndFromRight));

        return ans ; 
    }
}