class Solution {
public:
    int maxFreq(string s, int maxLetters, int minSize, int maxSize) {

        int start = 0;
        vector<int> arr(26, 0);
        int count = 0;

        for (int i = 0; i < minSize; i++) {
            if (arr[s[i] - 'a'] == 0) {
                count++;
                arr[s[i] - 'a']++;
            } else {
                arr[s[i] - 'a']++;
            }
        }

        int i = minSize - 1;

        unordered_map<string, int> mpp;
        int maxCount  = 0;

        while (i < s.size()) {

            string sub = s.substr(start, minSize);
            cout << sub << " ";

            if (count <= maxLetters) {
                mpp[sub]++;
                maxCount = max(maxCount , mpp[sub]);
            }

            if ((arr[s[start] - 'a'] - 1) == 0) {
                count--;
            }

            arr[s[start] - 'a']--;
            start++;

            i++;

            if (i < s.size()) {
                if (arr[s[i] - 'a'] == 0) {
                    count++;
                } 
                arr[s[i] - 'a']++;
            }
        }

        // for (auto it : mpp){
        //     if(it.second > max){
        //         max = it.second;
        //     }
        // }

        return maxCount;
    }
};