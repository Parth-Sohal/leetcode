class Solution {
    public long sumAndMultiply(int n) {

        long ans = 0 ;
        long sum = 0 ;
        int place = 1; 
        

        while(n > 0){

            int digit = n % 10 ; 

            if(digit % 10 != 0){

                ans = digit * place + ans ; 
                place = place * 10 ; 

            }

            n = n / 10 ;
            sum += digit ; 

        }

        return ans * sum ; 



        
    }
}