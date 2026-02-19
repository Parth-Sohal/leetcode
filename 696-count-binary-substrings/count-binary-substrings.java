class Solution {
    public int countBinarySubstrings(String s) {
        
            int grp1 = 0 ;
        int grp2 = 0 ;


        int i = 0 ;
        int l = s.length() ;

        char ch = s.charAt(0);
        int total = 0 ;


        while(i < l && s.charAt(i) == ch){
            grp1++;
            i++;
        }


        while(i < l){

            char chCurrent = s.charAt(i);

            int count = 0 ;
            while(i < l && chCurrent == s.charAt(i)){
                i++;
                grp2++;

                if(grp2 <= grp1){
                    count++;
                }
            }

            total = total + count;
            grp1 = grp2;
            grp2 = 0 ;

        }


        return total ; 

    }
}