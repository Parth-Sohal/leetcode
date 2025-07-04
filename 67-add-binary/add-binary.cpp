class Solution {
public:
    string addBinary(string a, string b) {
        int n = a.size();
        int m = b.size();

        int i = n - 1;
        int j = m - 1;

        int carry = 0;
        string s;

        while (i >= 0 && j >= 0) {

            int countZero = 0;
            int countOne = 0;

            // cout << carry << " " << a[i] << " " << b[j] << " " << " = > ";

            if (a[i] == '0') {
                // cout << "here   "
                countZero++;
            } else {
                countOne++;
            }

            if (b[j] == '0') {
                // cout << "here";
                countZero++;
            } else {
                countOne++;
            }

            if (carry == 0) {
                countZero++;
            } else {
                countOne++;
            }

            // cout << countZero << " " << countOne << endl;

            if (countZero == 3) {
                carry = 0;
                s.append("0");
            } else if (countZero == 2 && countOne == 1) {
                carry = 0;
                s.append("1");
            } else if (countZero == 1 && countOne == 2) {
                carry = 1;
                s.append("0");
            } else if (countOne == 3) {
                carry = 1;
                s.append("1");
            }

            i--;
            j--;
        }

        while (i >= 0) {
            int countZero = 1;
            int countOne = 0;

            // cout << carry << " " << a[i] << " " << '0' << endl;

            if (a[i] == '0') {
                // cout << "here   "
                countZero++;
            } else {
                countOne++;
            }

            if (carry == 0) {
                countZero++;
            } else {
                countOne++;
            }

            if (countZero == 3) {
                carry = 0;
                s.append("0");
            } else if (countZero == 2 && countOne == 1) {
                carry = 0;
                s.append("1");
            } else if (countZero == 1 && countOne == 2) {
                carry = 1;
                s.append("0");
            } else if (countOne == 3) {
                carry = 1;
                s.append("1");
            }

            i--;
        }

        while (j >= 0) {
            int countZero = 1;
            int countOne = 0;

            // cout << carry << " " << '0' << " " << b[j] << endl;

            if (b[j] == '0') {
                // cout << "here   "
                countZero++;
            } else {
                countOne++;
            }

            if (carry == 0) {
                countZero++;
            } else {
                countOne++;
            }

            if (countZero == 3) {
                carry = 0;
                s.append("0");
            } else if (countZero == 2 && countOne == 1) {
                carry = 0;
                s.append("1");
            } else if (countZero == 1 && countOne == 2) {
                carry = 1;
                s.append("0");
            } else if (countOne == 3) {
                carry = 1;
                s.append("1");
            }

            j--;
        }

        if (carry == 1) {
            s.append("1");
        }

        reverse(s.begin(), s.end());

        return s;
    }
};