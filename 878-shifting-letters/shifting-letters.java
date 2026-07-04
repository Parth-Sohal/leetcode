class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        int n = s.length() , sum = 0 ;
        StringBuilder sb = new StringBuilder(s) ;

        for(int i = n - 1 ; i >= 0 ; i--){

           
            sum  = (sum + shifts[i]) % 26 ; 
            char ch = ( (char)( ((s.charAt(i) - 'a' + sum) % 26) + 'a' ) ) ;

            sb.setCharAt(i ,ch) ;

        }

        return sb.toString() ;



    }
}