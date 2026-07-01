class Solution {
    // atlseat not at most 
    public long countSubarrays(int[] nums, int k) {

        int max = Arrays.stream(nums).max().getAsInt();

        int count = 0 ;
        int start = 0 ;
        long ans = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == max)count = count + 1;

            while(count >= k){
                ans += (nums.length - i) ;
                if(nums[start] == max){
                    count--;
                }
                start++;
            }

        }

        return ans ; 
       
    }
}