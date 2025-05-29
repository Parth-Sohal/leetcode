class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int> arr(26,0);

        // vector<int> arr(26,0);


        for(int i = 0 ; i < s.size() ;i++){
            int idx = (int)s[i] - 'a';
            // cout << idx << "  " << s[i] <<  endl;
            arr[idx]++;
        }

        for(int j = 0 ; j < t.size() ;j++){
            int idx = (int)t[j] - 'a';
            // cout << idx << "  " << t[j] <<  endl;
            arr[idx]--;
        }

        for(int i = 0 ; i<26 ;i++){
            // cout << arr[i] << " ";
            if(arr[i]!=0){
                return false;
            }
        }

        return true;
    }
};