class Solution {
public:
    int totalFruit(vector<int>& fruits) {

        int n = fruits.size();
        int i = 0;
        int first = fruits[0];

        int k = 0;
        while (k < fruits.size() && fruits[k] == first) {
            k++;
        }

        if (k == n)
            return n;

        int y = k;
        int next = k;
        int second = fruits[k];

        while (y < fruits.size() && fruits[y] == fruits[k]) {
            y++;
        }

        if(y == n) return n;

        int j = y;
        int ans = j;


        while (j < fruits.size()) {

            // cout << first << " " << second << endl;

            if (fruits[j] == first || fruits[j] == second) {
                next = j;
                int k = j;
                while (k < fruits.size() && fruits[k] == fruits[j]) {
                    k++;
                }
                j = k - 1;
            } else {
                i = next;
                next = j;
                int k = j;
                while (k < fruits.size() && fruits[k] == fruits[j]) {
                    k++;
                }
                j = k - 1;
                first = fruits[i];
                second = fruits[j];
            }
            ans = max(ans, j - i + 1);
            j++;
        }

        return ans;
    }
};