class Solution {

    public boolean helper(int[] nums , int mid , int k){

        int students = 1 ; 
        int pages = 0 ; 

        for(int page : nums){

            if(page + pages > mid){

                students++;

                if(students > k){
                    return false ;
                }

                pages = page;
            
            }
            else{
                pages += page ; 
            }
            
        }

        return true; 
        
        
    }
    
    public int splitArray(int[] nums, int k) {

        int low = 0 ; 
        int high = 0 ; 

        for(int i : nums){
            low = Math.max(i , low);
            high += i ;
        }


        while(low <= high){

            int mid = low + (high - low)/2 ;

            if(helper(nums , mid , k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }

        return low ; 
        
    }
}