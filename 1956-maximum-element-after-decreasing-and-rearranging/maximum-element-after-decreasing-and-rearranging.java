class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        
        Arrays.sort(arr) ;

        int max = arr[0] ;
        arr[0] = 1; 

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] - max <= 1){
                max = arr[i] ;
            }
            else{
                max = max + 1 ;
            }

        }


        return max ; 


    }
}