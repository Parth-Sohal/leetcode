class Solution {


    public static int helper(int[] nums  , int k){

        int ans = 0 ; 
        int oddCount = 0 , start = 0 ;

        for(int i =0 ; i < nums.length ; i++){

            if(nums[i]%2 != 0)oddCount++ ;

            while(oddCount > k){
                if(nums[start] % 2 != 0)oddCount--;
                start++;
            }

            ans += (i - start + 1);

        }

        return ans ; 



    }


    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
}