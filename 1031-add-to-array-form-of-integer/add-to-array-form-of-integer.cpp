class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {

        int n = num.size();

        int i = n - 1;
        int carry = 0;

        while (i >= 0 && k) {
            int mod = k % 10;
            int ans = num[i] + mod + carry;

            num[i] = ans % 10;

            carry = ans / 10;
            // cout << carry << endl;

            k = k / 10;

            i--;
        }

        while (i >= 0) {
            int ans = num[i] + carry;
            num[i] = ans % 10;
            carry = ans / 10;
            i--;
        }

        while (k > 0 || carry > 0) {
            int sum = (k % 10) + carry;
            num.insert(num.begin(), sum % 10);
            carry = sum / 10;
            k /= 10;
        }

        return num;
    }
};