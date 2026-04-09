class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int start = 0;
        int sum = 0 ;

        int arrSum = Arrays.stream(arr).sum();
        if(arrSum < k)return 0 ; 


        int j = 0 ;
        int min = Integer.MAX_VALUE ;

        while(j < arr.length){

            sum +=  arr[j];

            if(sum >= k){

                while(start <= j && sum >= k){
                    min = Math.min(min, j - start + 1);
                    sum -= arr[start];
                    start++ ;
                }

            }

            j++;



        }

        
        return min ; 
    }
}