class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int low = 1 ;
        int end = arr.size()-2;

        while(low <= end){
            int mid = (low + end)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                low = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
};