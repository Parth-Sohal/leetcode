class Solution {
    public boolean search(int[] nums, int k) {
        
        int start = 0 ;
        int end = nums.length -1 ;

        while(start <= end){

            int mid = start + (end - start)/2 ;

            if(nums[mid] == k){
                return true;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue ;
            }


            if(nums[mid] >= nums[start]) // left side sorted hai
            {
                if(k >= nums[start] && k < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1 ;
                }
            }


            else{ // right part sorted hai isme check kaar lo element ko


                if(k > nums[mid] && k <= nums[end]){
                    start  = mid + 1 ;
                }else{
                    end = mid - 1 ;
                }

            }
        }

        return false;

    }
}