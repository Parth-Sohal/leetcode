class Solution {
public:
    int binarySearch(vector<int>& nums  , int start , int end ,int target){
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid ;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
        
    int search(vector<int>& nums, int target) {


        for(int i = 0 ; i < nums.size() ; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;

        
    
        
        
    }
};