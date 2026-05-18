class Solution {
    public boolean isBalanced(String num) {


        int sumEven = 0 ;
        int sumOdd = 0 ; 


        for(int i= 0 ; i < num.length() ; i++){
            int n = num.charAt(i) - '0';

            if(i % 2 == 0){
                sumEven += n ;
            }
            else{
                sumOdd += n ;
            }

        }

        return sumEven == sumOdd ; 
        
    }
}