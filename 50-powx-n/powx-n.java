class Solution {

    public double pow(double a, int b) {
        
        if(b == 0){
            return 1 ; 
        }

        if (b == 1) {
            return a;
        }

        double ans = pow(a, b / 2);

        if (b % 2 == 0) {
            return ans * ans;
        } else {
            return a * ans * ans;
        }
    }

    public double myPow(double x, int n) {

        if(n < 0){
            return 1/ pow(x,n);
        }


        return pow(x,n) ;


    }
}