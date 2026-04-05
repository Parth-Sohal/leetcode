class Solution {
    public int furthestDistanceFromOrigin(String moves) {


        int n = moves.length() ;
        int xL = 0 ;
        int xR = 0 ;

        for(int i = 0 ; i < moves.length() ; i++){

            char ch = moves.charAt(i);

            if(ch == 'L'){
                xL++;
                xR++;
            }

            else if(ch == 'R'){
                xL--;
                xR--;
            }

            else{
                xL++;
                xR--;
            }
        }

        return Math.max(Math.abs(xL) , Math.abs(xR)) ;
        
    }
}