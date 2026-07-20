class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length() ;
        int m = needle.length() ;


        for(int i = 0 ; i < n ; i++){
            int max = i + m ; 
            if(max > n){
                max = n ;
            }
            String str = haystack.substring(i ,  max) ;
            if(str.equals(needle)){
                return i ;
            }
        }

        return -1 ; 
        
    }
}