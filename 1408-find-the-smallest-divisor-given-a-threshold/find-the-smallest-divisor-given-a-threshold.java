class Solution {

    public boolean helper(int[] nums , int mid , int k){

        int ans = 0 ; 

        for(int i : nums){
            ans += ((i + mid - 1)/ mid);
        }

        return ans <= k ; 

    }


    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1 ; 
        int high = 0 ; 
        for(int i : nums){
            high = Math.max(i , high);
        }


        while(low <= high){

            int mid = low + (high-low)/ 2; 

            if(helper(nums , mid , threshold)){
                high = mid - 1;
            }

            else{
                low = mid + 1; 
            }


        }

        return low ;


    }
}


//  1 2 5 9





