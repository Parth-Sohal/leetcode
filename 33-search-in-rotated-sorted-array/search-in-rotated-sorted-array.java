class Solution {
    public int search(int[] nums, int k) {
        int low = 0 ;
        int high = nums.length -1 ;

        while(low <= high){

            int mid = low + (high - low)/2 ;

            if(nums[mid] == k){
                return mid;
            }

            if(nums[mid] >= nums[low]) // left side sorted hai
            {
                if(k >= nums[low] && k < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1 ;
                }
            }


            else{ // right part sorted hai isme check kaar lo element ko


                if(k > nums[mid] && k <= nums[high]){
                    low  = mid + 1 ;
                }else{
                    high = mid - 1 ;
                }

            }
        }

        return -1;
    }
}