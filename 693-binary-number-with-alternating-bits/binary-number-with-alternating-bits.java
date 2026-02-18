class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int x = n ^ ( n >> 1 );

        return (n & (x+1)) == 0;


    }
}