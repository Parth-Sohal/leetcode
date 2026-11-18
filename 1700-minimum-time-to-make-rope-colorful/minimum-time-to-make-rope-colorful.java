class Solution {
    public int minCost(String colors, int[] neededTime) {

        int i = 0;
        int j = 1;
        int n = neededTime.length;
        int ans = 0;

        while (j < n) {

            if (colors.charAt(i) == colors.charAt(j)) {

                if (neededTime[j] <= neededTime[i]) {
                    ans += neededTime[j];
                } else {
                    ans += neededTime[i];
                    i = j;
                }

            }

            else {
                i = j;
            }

            j++;

        }

        return ans;

    }
}