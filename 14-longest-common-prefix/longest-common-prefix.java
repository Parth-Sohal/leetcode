class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);



        String fst = strs[0];
        String lst = strs[strs.length - 1];
        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();

        while (i < fst.length() && j < lst.length()) {

            if (fst.charAt(i) == lst.charAt(j)) {
                sb.append(fst.charAt(i));
                i++;
                j++;
            }

            else {
                break;
            }

        }

        return sb.toString(); 
    }
}