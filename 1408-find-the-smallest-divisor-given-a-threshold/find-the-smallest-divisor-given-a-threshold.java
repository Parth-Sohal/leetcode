class Solution {

    public boolean dividesByDivisor(int[] arr , int mid , int threasHold){

        int sum = 0  ;

        for(int i : arr){
            sum += (i + mid - 1) / mid ; 
        }

        return sum <= threasHold;

    }


    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1 ; 
        int high = Arrays.stream(nums).max().getAsInt() ;


        while(low <=  high){

            int mid = low + (high - low)/2 ;

            boolean ans = dividesByDivisor(nums  ,mid , threshold) ;   


            if(ans){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }


        return low ; 


    }
}