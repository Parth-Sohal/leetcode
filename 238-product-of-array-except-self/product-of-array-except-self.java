class Solution {
    public int[] productExceptSelf(int[] nums) {

        int countZero = 0;
        int prd = 1;

        for (int i : nums) {

            if (i == 0 && countZero == 0) {
                countZero++;
            } else if (i == 0 && countZero > 0) {
                prd = 0;
                break;
            } else {
                prd = prd * i;
            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (countZero == 1) {
                if (nums[i] == 0) {
                    nums[i] = prd;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = prd / nums[i];
            }
        }

        return nums ;

    }
}