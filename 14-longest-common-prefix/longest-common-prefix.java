class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sol = strs[0];

        for (int i = 1; i < strs.length; i++) {
            System.out.println(sol + " " + strs[i]);
            int j = 0;
            int k = 0;
            while (j < strs[i].length() && k < sol.length()) {

                if (strs[i].charAt(j) != sol.charAt(k)) {
                    break;
                }
                j++;
                k++;
            }
            // System.out.println(strs[i].substring(0, j));
            sol = strs[i].substring(0, j);

        }

        return sol ;
    }
}