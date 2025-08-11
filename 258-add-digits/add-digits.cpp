class Solution {
public:

    int ans(int n){
        if(n == 0)return 0 ;
        return n%10 + ans(n / 10);
    }


    int addDigits(int num) {
        
        int a = ans(num) ;

        while(a >= 10 ){
            a = ans(a);
        }

        return a ;

    }
};