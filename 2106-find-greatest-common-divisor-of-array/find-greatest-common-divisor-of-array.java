class Solution {

    private int gcd(int a , int b){
        if(a == 0){
            return b ;
        }

        return gcd(b % a , a) ;
    }

    public int findGCD(int[] nums) {

        int smallest = Arrays.stream(nums).min().getAsInt() ;
        int largest = Arrays.stream(nums).max().getAsInt() ;

        return gcd(smallest , largest) ; 

    }
}