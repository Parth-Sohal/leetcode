class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : p.toCharArray()) {
            count1[c - 'a']++;
        }

        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            count2[ch - 'a']++;

            if (i  >= p.length()) {
                count2[s.charAt(start) - 'a']--;
                start++;
            }

            if (Arrays.equals(count1, count2)) {
                ans.add(i - p.length() + 1);
            }

        }

        return ans;
    }
}