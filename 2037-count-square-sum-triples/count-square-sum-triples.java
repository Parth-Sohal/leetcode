class Solution {
    
    static boolean sqrt(int n,int a){

        int low = 1 ;
        int high = n ;

        while(low <= high){
            int mid = low + (high - low)/2;
            int prod = mid * mid ;

            if(prod == n){
                if(mid > a){
                    high = mid - 1;
                }
                else{
                    return true;
                }
            }

            if(prod > n){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }

        }

        return false;

    }

    public int countTriples(int n) {
        
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = i+1 ; j <= n ; j++){
                int prod = i*i + j*j;
                if(sqrt(prod,n)){
                    count+=2;
                }
            }
        }

        return count;

    }
}