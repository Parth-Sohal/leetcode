class Solution {
public:
    void nextPermutation(vector<int>& arr) {

        int idx = -1;
        int n = arr.size();

        for (int i = n - 2; i >= 0; i--) {
            // arr[i] > arr[i+1] se increasing me tha tooh ho raha tha mtlb koi
            // bhi replace wala mill nahi raha tha
            if (arr[i + 1] > arr[i]) {
                idx = i;
                break;
            }
        }
        // cout << idx << endl;

        if (idx == -1) {
            reverse(arr.begin(), arr.end());
        }

        else {
            // just the next greater element ko replace karna hoga

            int i = n - 1;
            while (i > idx) {
                if (arr[i] > arr[idx]) {
                    swap(arr[idx], arr[i]);
                    reverse(arr.begin() + idx + 1, arr.end());
                    
                    break;
                }
                i--;
            }
        }
    }
};