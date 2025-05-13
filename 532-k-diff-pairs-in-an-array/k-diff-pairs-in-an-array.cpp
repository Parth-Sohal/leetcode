class Solution {
public:
    int binarySearch(vector<int>& arr, int x, int s) {
        int start = s;
        int end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    int method2(vector<int>& arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            if (binarySearch(arr, k + arr[i], i + 1)) {
                // cout << " here" << endl;
                if (binarySearch(arr, k + arr[i], i + 1) == i) {
                    continue;
                }
                // cout << arr[i] << "  "
                    // << arr[binarySearch(arr, k + arr[i], i + 1)] << endl;
                count++;
            }
        }
        return count;
    }
    int findPairs(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        // int i = 0 ;
        // int j = 1 ;
        // int count = 0 ;
        // while(j < nums.size()){
        //     // cout << i << " " << j << endl;
        //     int dif = nums[j]- nums[i];

        //     if (i == j) {
        //         j++;
        //         continue;
        //     }

        //     if( dif == k){
        //         // cout << nums[i] << " "  << nums[j] << endl;
        //         count++;
        //         i++;
        //         j++;
        //         if(j < nums.size() && nums[j]==nums[j-1]){
        //             while(j < nums.size() && nums[j]==nums[j-1]){
        //                 j++;
        //             }
        //         }
        //     }

        //     else if(dif > k){
        //         i++;
        //     }
        //     else{
        //         j++;
        //         if(j < nums.size() && nums[j]==nums[j-1]){
        //             while(j < nums.size() && nums[j]==nums[j-1]){
        //                 j++;
        //             }
        //         }
        //     }
        // }
        return method2(nums, k);
    }
};