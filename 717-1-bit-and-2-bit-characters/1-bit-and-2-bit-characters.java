class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int i = 0 ;
        int l = bits.length - 1;

        while(i < l) {

            if(bits[i] == 1){
                i+=2;
            }

            else if(bits[i] == 0){
                i++;
            }

        }

        if(i == l) return true ;
        return false; 
    }
}