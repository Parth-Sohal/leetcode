class Solution {
public:
    string largestGoodInteger(string num) {

        // long long myNum = stoi(num);
        // string ans = "";

        // while(myNum > 99){

        //     int mod = myNum % 1000;
        //     int a = mod % 10 ;
        //     int b =  ( mod / 10 ) % 10 ;
        //     int c = (mod / 100) % 10 ;

        //     if(a == b && b == c){
        //         ans = max(ans, to_string(mod));;
        //     }

        //     myNum = myNum / 10;
        // }

        // return ans;

        int i = 0;
        // int j = 2;
        string ans = "";
        while (i+2 < num.size()) {
            if ((num[i] == num[i+1]) && num[i] == num[i + 2]) {
                string current = num.substr(i, 3);
                if (current > ans) {
                    ans = current;
                }
            }
            // j++;
            i++;
        }

        return ans;
    }
};