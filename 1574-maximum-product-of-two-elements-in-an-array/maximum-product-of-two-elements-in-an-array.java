class Solution {
    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE ; 
        int smax = Integer.MIN_VALUE;
    

        for(int i : nums){

            if(i > max) {

                smax = max ; 
                max = i ;

            }

            else if(i > smax){
                smax = i ;
            }

        }

        return ((max-1) * (smax-1));



        
    }
}