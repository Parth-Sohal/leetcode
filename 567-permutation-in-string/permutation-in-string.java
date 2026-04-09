class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }
        int[] count2 = new int[26];

        int start = -1;
        int j = 0;

        while (j < s2.length()) {

            System.out.println(start + " " + j);
            char ch = s2.charAt(j);

            if (count1[ch - 'a'] == 0) {
                start = -1;
                Arrays.fill(count2,0);
            } else {

                if (start == -1) {
                    start = j;
                }

                count2[ch - 'a']++;

                while (count2[ch - 'a'] > count1[ch - 'a']) {
                    count2[s2.charAt(start) - 'a']--;
                    start++;
                }

            }

            if (start != -1 && j - start + 1 == s1.length() && Arrays.equals(count1, count2)) {
                return true;
            }

            j++;

        }

        return false;
    }
}