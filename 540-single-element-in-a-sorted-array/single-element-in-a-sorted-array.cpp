class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int start = 1;
        int end = nums.size() - 2;
        // cout << arr[end] << endl;4

        if(nums.size() == 1){
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.size() - 1] != nums[end]) {
            return nums[nums.size()-1];
        }
        while(start < end){
        int mid = (start + end)/2;

        if(mid%2 != 0){//odd
            if(nums[mid-1] == nums[mid]){
                start = mid + 1; // isse phele saab ok
            }
            else{
                end = mid - 1;
            }
        }
        else{//even
            if(nums[mid] == nums[mid+1]){
                start = mid + 2;
            }
            else{
                end = mid ;
            }
        }
    }

    return nums[start];


    }
};