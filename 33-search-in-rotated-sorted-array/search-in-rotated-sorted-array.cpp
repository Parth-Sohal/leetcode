class Solution {
public:

    int searchNoDublicates(vector<int>& arr,int target){

        int start = 0 ;
        int end = arr.size() - 1;

        while(start <= end){

            int mid = (start + end)/2;

            if(arr[mid] == target)return mid;

            else if(arr[mid] >= arr[start]){ // the sorted part is left
                if(target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }   

        return -1;

    }



        
    int search(vector<int>& nums, int target) {
        
        // int start = 0 , end = nums.size() - 1;

        // while(start <= end){

        //     int mid = (start + end) / 2;

        //     if(nums[mid] == target){
        //         return mid ; 
        //     }

        //     else if(nums[mid] > nums[end]){
        //         if(target >= nums[start] && target < nums[mid]){
        //             end = mid - 1;
        //         } else{
        //             start = mid + 1;
        //         }
        //     }

        //     else{
        //         if(target > nums[mid] && target <= nums[end]){
        //             start = mid + 1 ;
        //         }else{
        //             end = mid - 1;
        //         }
                
        //     }

        //     // return -1;
            
        // }

        return searchNoDublicates(nums,target);

        
    
        
        
    }
};