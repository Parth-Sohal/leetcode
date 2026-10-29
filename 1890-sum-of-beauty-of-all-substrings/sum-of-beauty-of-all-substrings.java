class Solution {
    public int beautySum(String s) {
       
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            int[] arr = new int[26];

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);
                arr[ch - 'a']++;

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int k : arr) {
                    if (k == 0)
                        continue;
                    max = Math.max(max, k);
                    min = Math.min(min, k);
                }

            
                ans += max - min;

            }

        }
        return ans;
    }
}