class Solution {

    long reverse(long rev , long n){

        if(n == 0){
            return rev ; 
        }

        if(n % 10 == 0){
            return reverse(rev , n / 10) ;
        }

        rev = (rev * 10) + (n % 10) ;

        return reverse(rev , n / 10) ;

    }

    long sum(long n){

        if(n == 0)return 0 ;

        return n%10 + sum(n / 10);
    }


    public long sumAndMultiply(int n) {
        
        long n2 = reverse(0L, (long)n) ;
        long sum = sum(n2);


        return reverse(0,n2) * sum ;

    }
}