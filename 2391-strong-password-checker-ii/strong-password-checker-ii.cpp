class Solution {
public:
    bool strongPasswordCheckerII(string password) {
        if(password.size() < 8)return false;

        unordered_set<char> specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        bool hasDigit = false;
        bool hasUpper = false;
        bool hasLower = false;
        bool hasSpecial = false;

        for(int i = 0 ; i < password.size() ;i++){

             if (i > 0 && password[i] == password[i - 1]) {
                return false;
            }

             if (isdigit(password[i])) {
                hasDigit = true;
            } else if (islower(password[i])) {
                hasLower = true;
            } else if (isupper(password[i])) {
                hasUpper = true;
            } else if (specialChars.find(password[i]) != specialChars.end()) {
                hasSpecial = true;
            }
        }

        return hasDigit && hasUpper && hasLower && hasSpecial;

    }
};