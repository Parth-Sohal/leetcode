class Solution {
    public int minOperations(String s) {


        int count = 0 ;

        int mnOneStart = 0 ;
        int mnZeroStart = 0 ;
        char ch1 = '0';
        char ch2 = '1' ;

        for(int i = 0 ;  i < s.length() ; i++){

            char ch = s.charAt(i);


            if(ch1 != ch){
                mnZeroStart++;
            }
            else{
                mnOneStart++;
            }


            char temp = ch1 ;
            ch1 = ch2  ;
            ch2 = temp ;

        }
        
        return Math.min(mnZeroStart , mnOneStart);


    }
}