class Solution {

    private int prod(int num){
        if(num < 10)return num ;
        return num%10 * prod(num / 10);
    }


    public int smallestNumber(int n, int t) {
        
        while(true){
            if(prod(n++) % t == 0)return --n ;
        }

        // return -1 ; 

    }
}