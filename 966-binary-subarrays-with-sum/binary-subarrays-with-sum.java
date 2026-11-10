class Solution {
    public int atMostK(int[] nums, int k) {

        if(k < 0)return 0 ; 

        int start = 0, n = nums.length, ans = 0 , sum = 0 ;

        for (int end = 0; end < n; end++) {

            sum += nums[end];

            while(sum > k){
                sum -= nums[start++];
            }


            ans += (end - start + 1);

        }

        return ans;

    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMostK(nums, goal) - atMostK(nums,goal -1); 
    }
}