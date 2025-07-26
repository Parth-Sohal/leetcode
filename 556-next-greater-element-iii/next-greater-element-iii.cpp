class Solution {
public:
    int nextGreaterElement(int n) {

        vector<int> arr;
        while (n) {
            arr.push_back(n % 10);
            n = n / 10;
        }
        reverse(arr.begin(), arr.end());
        int idx = -1;
        int lenght = arr.size();
        for (int i = lenght - 2; i >= 0; i--) {
            if (arr[i + 1] > arr[i]) {
                idx = i;
                break;
            }
        }
     
        if (idx == -1)
            return -1;
        else {
            int i = lenght - 1;
            while (i > idx) {
                if (arr[i] > arr[idx]) {
                    swap(arr[i], arr[idx]);
                    reverse(arr.begin() + idx + 1, arr.end());
                    break;
                }
                i--;
            }
        }

        long prod = 0;
        for (int i = 0; i < lenght; i++) {
            prod = (prod * 10) + arr[i];
        }
        if (prod > INT_MAX) {
            return -1;
        }
        return prod;
    }
};