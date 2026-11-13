class Solution {

    public int firstIdx(int[] nums , int target){

        int low = 0 ; 
        int high = nums.length - 1; 
        int ans = -1 ;

        while(low <= high){

            int mid = low + (high - low) / 2 ;


            if(nums[mid] == target){
                ans = mid ; 
                high = mid - 1 ;
            }


            else if(nums[mid] < target){
                low = mid + 1 ;
            }

            else{
                high = mid - 1; 
            }

        }

        return ans ; 

    }

    public int lastIdx(int[] nums , int target){

        int low = 0 ; 
        int high = nums.length - 1; 
        int ans = -1 ;

        while(low <= high){

            int mid = low + (high - low) / 2 ;


            if(nums[mid] == target){
                ans = mid ; 
                low = mid + 1;
            }


            else if(nums[mid] < target){
                low = mid + 1 ;
            }

            else{
                high = mid - 1; 
            }

        }

        return ans ; 

    }

    public int[] searchRange(int[] nums, int target) {
        int a = firstIdx(nums , target);
        if(a == -1){
            return new int[]{-1,-1};
        }
        int b = lastIdx(nums , target);

        return new int[]{a,b};
    }
}