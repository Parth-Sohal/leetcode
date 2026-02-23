class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        if (k > s.length()) {
            return false ;
        }

        StringBuilder sb = new StringBuilder(s.substring(0, k));
        set.add(sb.toString());
        for (int i = k; i < s.length(); i++) {

            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            set.add(sb.toString());
        }

        if(set.size() == (int)Math.pow(2,k)){
            return true ;
        }

        return false ; 


    }
}