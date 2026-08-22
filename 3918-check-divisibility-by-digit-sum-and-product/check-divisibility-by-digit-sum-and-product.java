class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0 ; 
        int prod = 1 ; 

        int num = n ;

        while(num > 0){
            int mod = num % 10  ; 
            sum = sum + mod ; 
            prod = prod * mod ;
            num = num / 10 ; 
        }


        return n % (sum + prod) == 0;
        
    }
}