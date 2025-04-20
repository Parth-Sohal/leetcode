class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int low = 0 ;
        int high = arr.size()-1;

        // while(low <= end){
        //     int mid = (low + end)/2;
        //     if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
        //         return mid;
        //     }
        //     else if(arr[mid] > arr[mid-1]){
        //         low = mid + 1;
        //     }
        //     else{
        //         end = mid - 1;
        //     }
        // }
        // return -1;

        while(low < high){
            int mid = ( low + high )/2;
            if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
};