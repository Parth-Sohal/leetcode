class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        int idx = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int mod = (int) (Math.pow(26, idx) * (s.charAt(i) - 'A' + 1));
            ans += mod;
            idx++;

        }

        return ans ; 
    }
}