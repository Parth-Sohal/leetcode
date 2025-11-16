class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int idx = nums[i];
            // if at place

            if (nums[i] == nums[idx - 1]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[idx - 1];
                nums[idx - 1] = temp;
            }
        }

        int[] ans = new int[2];

        for(int io = 0 ;  io < nums.length; io++){
            
            if((io+1) != nums[io]){
                ans[1] = io+1;
                ans[0] = nums[io];
            }
            
        }

        return ans; 
    }
}