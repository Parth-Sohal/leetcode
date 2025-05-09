class Solution {
public:
    bool check(char ch) {
        string vowels = "aeiouAEIOU";
        int l = vowels.size();

        for (int i = 0; i < l; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }
        return false;
    }
    string reverseVowels(string s) {
        int i = 0;
        int j = s.size() - 1;

        while (i < j) {
            cout << s[i] << " " << s[j] << endl;
            if (check(s[i]) && check(s[j])) {
                cout << "match " << s[i] << " " << s[j] << endl;
                swap(s[i], s[j]);
                i++;
                j--;
            }
            if (!check(s[i])) {
                i++;
            }
            if (!check(s[j])) {
                j--;
            }
        }
        return s;
    }
};