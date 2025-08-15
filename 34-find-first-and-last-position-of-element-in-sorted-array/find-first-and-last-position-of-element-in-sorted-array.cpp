class Solution {
public:

    int firstOccurnace(vector<int>& arr,int x){
        int start = 0 ;
        int end = arr.size() - 1;
        int ans = -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == x){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans ;
    }

    int lastOccurnace(vector<int>& arr,int x){
        int start = 0 ;
        int end = arr.size() - 1;
        int ans = -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == x){
                start = mid + 1;
                ans = mid ;
            }
            else if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans ;
    }

    vector<int> searchRange(vector<int>& nums, int target) {
        return {firstOccurnace(nums,target),lastOccurnace(nums,target)};
    }
};