class Solution {
    public int minDeletion(int[] nums) {

        int n = nums.length;

        int idx = 0;
        int del = 0;

        while (idx < n - 1) {

            if ((idx - del) % 2 == 0) {

                if (nums[idx] == nums[idx + 1]) {
                    del++;
                }

            }

            idx++;

        }

        if((n - del) % 2 == 0)return del ;
        return del + 1 ; 

    }
}