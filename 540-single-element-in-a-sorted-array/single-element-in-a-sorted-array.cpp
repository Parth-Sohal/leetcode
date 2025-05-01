class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int start = 0;
        int end = nums.size() - 1;
        // cout << arr[end] << endl;4

        
        while(start <= end){
        int mid = (start + end)/2;

        if(start == end){
            return nums[mid];
        }

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

    // return nums[start];
    return -1;


    }
};