class Solution {
public:
    int findMin(vector<int>& nums) {
        int start = 0 ;
        int end = nums.size()-1;

        while(start < end){
            int mid = (start + end)/2;

            if(nums[start] == nums[mid] && start!=mid){
                start++;
                continue;
            }

            if(nums[end] == nums[mid] && end!=mid){
                end--;
                continue;
            }

            if(nums[mid] < nums[end]){
                end = mid ;
            }

            else{
                start = mid + 1;
            }
        }
        return nums[start];
    }
};