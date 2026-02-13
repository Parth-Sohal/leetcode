class Solution {
    public int appendCharacters(String s, String t) {
        int i =  0 ;  // s ko repe
        int j =  0 ;  // t ko repe



        while( i < s.length() && j < t.length() ){

            if(s.charAt(i) == t.charAt(j)){
                j++;
            }


            i++;

        }


        // if(j == t.length())return 0 ;

        return t.length() - j ; 

    }
}