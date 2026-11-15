class Solution {

    public boolean helper(int[] nums , int m , int k , int mid){

        int count = 0 , ans = 0  ; 

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] <= mid){
                count++;
            }

            else{

                ans += (count / k);
                count = 0;
            }

        }

        ans += count / k;

        return ans >= m ; 

    }

    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m*k > bloomDay.length){
            return -1; 
        }

        int low = 0 ; 
        int high = 0 ; 

        for(int i : bloomDay){
            low = Math.min(i , low);
            high = Math.max(i , high);
        }
        

        while(low <= high){

            int mid = low + (high - low)/2 ; 

            if(helper(bloomDay , m , k , mid)){
                high = mid - 1;
            }

            else{
                low = mid + 1 ; 
            }

        }

        return low ; 


    }
}