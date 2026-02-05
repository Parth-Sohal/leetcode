class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ansArr = new int[n];

        for(int i = 0 ; i < n; i++){

            if(nums[i] == 0){
                ansArr[i] = nums[i];
            }

            else if(nums[i] > 0){
                int idx = (nums[i] + i) % n;
                ansArr[i] = nums[idx];
            }

            else{
                int idx  =  ((i + nums[i]) % n + n) % n;
                ansArr[i] = nums[idx];
            }

        }

        return ansArr ; 
    }
}