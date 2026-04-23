class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {

        int n = arr.length ;
        
        int[] leftPRf =  new int[n];
       int[] ans = new int[n];

       int sumLeft = 0 ;
       int sumRight = 0 ;

       for(int i = 0 ; i < n ; i++){
           leftPRf[i] = sumLeft;
           sumLeft += arr[i];
       }


       for(int i = n - 1 ; i >= 0 ; i--){
           int countRight = n-1-i;

           ans[i] = Math.abs(leftPRf[i] - (i * arr[i])) + Math.abs(sumRight - ( countRight * arr[i]));
           sumRight += arr[i];
       }

       return ans  ; 

    }
}