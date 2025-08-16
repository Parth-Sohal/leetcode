class Solution {
public:
    int maximum69Number (int num) {

    int num1  = 0 ;
    int num2 = 0 ;
    int pow = 1 ;
    while(num){
        int mod = num%10 ;
        if(mod == 9){
            num2 = mod*pow + num2;
        }else{ 
            num2 = 9*pow + num1;
        }
        num1 = mod*pow + num1;
        num = num / 10;
        pow = pow * 10;

    }
    return num2;

    }
};