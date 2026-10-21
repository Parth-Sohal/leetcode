class Solution {
    public int minOperations(String s) {
        
        // check sorted 

        boolean isSorted = true  ; 
        int n = s.length() ; 
        int smallestIdx = 0 ; 
        int largestIdx = 0 ; 

        for(int i = 1 ; i < s.length() ; i++){

            if(s.charAt(i) < s.charAt(i-1)){
                isSorted = false; 
            }

            if(s.charAt(i) < s.charAt(smallestIdx)){
                smallestIdx = i ;
            }
            if(s.charAt(i) >= s.charAt(largestIdx)){
                largestIdx = i ; 
            }

        }

        if(isSorted)return 0;
        if(!isSorted && s.length() == 2)return -1 ; 

        if(smallestIdx == 0 || largestIdx == n - 1)return 1 ; 
        if(largestIdx == 0 && smallestIdx == n-1)return 3 ;  

        return 2; 
               


    }
}