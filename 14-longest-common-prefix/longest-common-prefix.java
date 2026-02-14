class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        // System.out.println(Arrays.toString(str));


        String last =  strs[strs.length-1];
        String first = strs[0];

        StringBuilder sb = new StringBuilder();

        int i = 0 ;
        int j = 0 ;


        while(i < last.length() && j < first.length()) {

            if(last.charAt(i) == first.charAt(j)) {
                sb.append(last.charAt(i));
            }

            else{
                break ;
            }

            i++;
            j++;

        }


        // System.out.println(sb.toString());

        return sb.toString(); 
    }
}