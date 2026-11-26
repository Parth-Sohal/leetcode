class Solution {
    public boolean canAliceWin(int n) {

        if (n<10) return false ;

        int curr = 10 ; 

        while(true){

            // alice le sakti hai 

            if(curr <= n){
                n = n - curr ;
            }
            else{
                return false ;
            }

            curr--;


            if(curr > n){
                return true ; 
            }
            else{
                n = n - curr ;
            }

            curr--; 
            
            
        }

    }
}