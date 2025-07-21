class Solution {
public:
    string makeFancyString(string s) {

        string newStr = "";
        int element = s[0];
        newStr.push_back(element);
        int count = 1;
        int i = 1;

        while (i < s.size()) {
            if (s[i] == element && count < 2) {
                // cout << s[i] << " " << count << endl;
                newStr.push_back(s[i]);
                count++;
            }

            else if (s[i] != element) {
                element = s[i];
                count = 1;
                newStr.push_back(element);
            }

            i++;
        }

        return newStr ;
    }
};