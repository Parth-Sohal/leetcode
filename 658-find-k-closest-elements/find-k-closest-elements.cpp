class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        for (int i = 0; i < arr.size(); i++) {
            int diff = abs(x - arr[i]);
            int idx = i;
            for (int j = i + 1; j < arr.size(); j++) {
                int dif = abs(x - arr[j]);
                // cout << dif << " " ;
                if (dif < diff) {
                    // cout << dif << " " << arr[j] << dif << endl;
                    idx = j;
                    diff = dif;
                }
            }
            // cout << arr[idx] << endl;
            swap(arr[i], arr[idx]);
        }
        vector<int>result;
        sort(arr.begin(), arr.begin() + k);
        for(int i = 0 ; i < k ;i++){
            result.push_back(arr[i]);
        }
        return result;
    }
};