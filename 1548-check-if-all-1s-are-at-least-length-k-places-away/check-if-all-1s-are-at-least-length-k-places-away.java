class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int n = nums.length;
        int last = - 1;
        int i = 0 ;
        
        while(i < n){
            if(nums[i] == 1){
                last = i ;
                break ;
            }
            i++;
        }
        i++;

        while(i < n){
            if(nums[i] == 1){
                int dist = i - last - 1;
                if(dist < k)return false;
                last = i ;
            }
            i++;

        }

        return true ; 
    }
}