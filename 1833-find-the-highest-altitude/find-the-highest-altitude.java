class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0 ;
        int last = 0 ;

        for(int i : gain){

            max = Math.max(max , last + i);
            last = last + i  ;

        }
        return max ; 
    }
}