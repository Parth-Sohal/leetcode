class Solution {
    public int countMonobit(int n) {

        int k = 0 ;

        int count = 0 ;

        while(k <= n){
            count++;
            k = k << 1 ;
            k = k | 1 ;
        }
        

        return count ; 
    }
}