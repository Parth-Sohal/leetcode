class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            arr1[s1.charAt(i) - 'a']++;
        }

        int start = 0;

        for (int j = 0; j < m; j++) {

            char ch = s2.charAt(j);
            arr2[ch - 'a']++;

            if (j - start + 1 == n) {

                boolean flag = true;

                for (int i = 0; i < 26; i++) {
                    if (arr1[i] != arr2[i]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    return true;
                }

                arr2[s2.charAt(start++) - 'a']--;

            }

        }

        return false;
    }
}