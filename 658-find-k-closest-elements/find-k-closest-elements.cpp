class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int i = 0;
        int j = arr.size()-1;

        while ((j - i + 1) > k) {
            int a = abs(arr[i] - x);
            int b = abs(arr[j] - x);
            if (a > b) {
                i++;
            } else {
                j--;
            }
        }

        vector<int> result;

        for (int k = i; k <= j; k++) {
            result.push_back(arr[k]);
        }

        return result;
    }
};