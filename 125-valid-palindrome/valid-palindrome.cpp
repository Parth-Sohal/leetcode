class Solution {
public:
    bool isPalindrome(string str) {
        int i = 0;
        int j = str.size() - 1;

        while (i <= j) {
            while (i < j && !isalnum(str[i])){
                i++ ;
                continue;
            }
            while (i < j && !isalnum(str[j])){
                j--;
                continue;
            }
            // cout << str[i] << " " << str[j] << endl;
            if (tolower(str[i]) != tolower(str[j])) {
                return false;
            } 
            i++;
            j--;
        }

        return true;
    }
};