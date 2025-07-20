class Solution {
public:
    int divisorSubstrings(int num, int k) {

        long q = 1 ;
        for(int i = 1 ; i <= k ;i++){
            q = q * 10 ;
        }
        // cout << q << endl;
        long count = 0 ;
        long cpyNum = num ;

        long limit = 1 ;
        for(int i = 1 ; i < k ;i++){
            limit = limit * 10 ;
        }
        // cout << limit-1 << endl;

        while(num > limit-1){
            long ans = num % q ;
            if(ans == 0){
                num = num / 10 ;
                continue;
            }
            if(cpyNum%ans == 0){
                count++;
            }
            num = num / 10 ;

        }

        return count ; 

    }
};