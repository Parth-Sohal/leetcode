class Solution {
    public int maxScore(int[] arr, int k) {

        int sum = Arrays.stream(arr).sum() ;
        int l = arr.length - k ; 
        int currSum = 0 ;
        int min = sum ; 

        for(int i = 0 ;  i < l ; i++){
            currSum += arr[i] ;
        }

        min = currSum ; 

        for(int i = l ; i < arr.length ; i++){
            currSum += arr[i] ;
            currSum -= arr[i - l];
            min = Math.min(min , currSum) ;
        }

        return sum -  min ; 



    }
}