class Solution {
    public double ans(double x , int n){
        if (n == 0) {
            return 1;
        }

        double ans1 = ans(x, n / 2);

        if (n % 2 == 0) {
            return ans1 * ans1;
        } else {
            return x * ans1 * ans1;
        }
    }


    public double myPow(double x, int n) {
    

        if(n < 0){
            return 1.0/ ans(x,-n);
        }

        return ans(x,n);        

    }
}