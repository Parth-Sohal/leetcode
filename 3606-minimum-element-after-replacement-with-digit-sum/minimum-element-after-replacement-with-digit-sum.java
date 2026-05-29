class Solution {

    public int sumOfDigits(int n){ // n is a number from array 

        int sum = 0 ; 

        while(n != 0){
            sum += ( n % 10 ) ;
            n = n / 10 ;  
        }

        return sum ; 

    }


    public int minElement(int[] nums) {
        
        int Min = Integer.MAX_VALUE ;


        for(int i : nums){
            Min = Math.min(Min , sumOfDigits(i));
        }

        return Min ; 

    }
}