class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int n = s.length();
        int start = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            arr[ch - 'a']++;

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                ans += (n - i);
                char c = s.charAt(start);
                arr[c - 'a']--;
                start++;
            }

        }

        return ans;
    }
}