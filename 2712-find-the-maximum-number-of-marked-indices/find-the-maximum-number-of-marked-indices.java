class Solution {
    

    public int maxNumOfMarkedIndices(int[] nums) {
        

        Arrays.sort(nums);
        int n = nums.length ; 

        int i = 0 , ans = 0 ; 
        int j = (n+1) / 2 ;

        while(j < n){

            if(nums[i] * 2 <= nums[j]){
                ans++;
                i++;
            }

            j++;

        }


        
        return ans * 2  ; 
        
        
    }
}