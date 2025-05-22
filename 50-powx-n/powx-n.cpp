class Solution {
public:
    double power(double n, int x){
    if(x == 0){
        return 1;
    }
    double half = power(n,x/2);
    if(x % 2 == 0){
        return half * half;
    }
    else{
        return half * half * n;
    }
}
double change(double n ,int x){
    long long a = x;
    if(x < 0){
        
        return 1.0/power(n,a);
    }
    return power(n,a);
}
    double myPow(double x, int n) {
        if(x==1){
            return 1;
        }
        return change(x,n);
    }
};