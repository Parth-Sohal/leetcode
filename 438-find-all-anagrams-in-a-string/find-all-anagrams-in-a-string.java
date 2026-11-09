class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        int m = s.length();
        int n = p.length();

        if (n > m) {
            return new ArrayList<>();
        }

        for (int i = 0; i < n; i++) { // p
            arr1[p.charAt(i) - 'a']++;
        }

        int start = 0;

        for (int j = 0; j < m; j++) {

            char ch = s.charAt(j);
            arr2[ch - 'a']++;

            if ((j - start + 1) == n) {

                boolean flag = true;

                for (int i = 0; i < 26; i++) {
                    if (arr1[i] != arr2[i]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    ans.add(start);
                }

                arr2[s.charAt(start++) - 'a']--;

            }

        }

        return ans;
    }
}