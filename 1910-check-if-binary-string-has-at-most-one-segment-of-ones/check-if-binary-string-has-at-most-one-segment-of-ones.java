class Solution {
    public boolean checkOnesSegment(String s) {


        int countOneRegular = 0 ; 


        for(int i = 0 ; i < s.length() ; i++){

            if(s.charAt(i) == '1' && (i == 0 || s.charAt(i-1) == '0')){
                countOneRegular++;
            }

            if(countOneRegular > 1)return false ;

        }

        return true ; 


        
    }
}