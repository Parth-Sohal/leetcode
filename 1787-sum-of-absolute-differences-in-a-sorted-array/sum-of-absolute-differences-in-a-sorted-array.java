class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        
        int[] leftPRf =  new int[arr.length];
       int[] ans = new int[arr.length];

       int sumLeft = 0 ;
       int sumRight = 0 ;

       for(int i = 0 ; i < arr.length ; i++){
           leftPRf[i] = sumLeft;
           sumLeft += arr[i];
       }


       for(int i = arr.length - 1 ; i >= 0 ; i--){
           int countRight = arr.length -1 - i;

           ans[i] = Math.abs(leftPRf[i] - (i * arr[i])) + Math.abs(sumRight - ( countRight * arr[i]));
           sumRight += arr[i];
       }

       return ans  ; 

    }
}