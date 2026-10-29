class Solution {
    public int beautySum(String s) {
        int[] arr = new int[26];
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

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

                //                System.out.println(max + " " + min);
                ans += max - min;

            }

            Arrays.fill(arr, 0);

        }
        return ans;
    }
}