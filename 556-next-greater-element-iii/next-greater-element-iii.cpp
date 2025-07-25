class Solution {
public:
    int nextGreaterElement(int n) {

        

        vector<int> arr ;
        while(n){
            arr.push_back(n % 10);
            n = n / 10 ;
        }

        reverse(arr.begin() , arr.end());

        int idx = -1;
        int a = arr.size() ;

        for(int i = a - 2 ; i >= 0 ; i--){
            if(arr[i+1] > arr[i]){
                idx = i ;
                break ;
            }
        }

        if(idx == -1)return -1;


        else{
            for(int i = a - 1 ; i > idx ; i--){
                if(arr[i] > arr[idx]){
                    swap(arr[idx] , arr[i]);
                    reverse(arr.begin() + idx+1 , arr.end());
                    break;
                }
            }
        }

        long prod = 0 ;

        for(int i = 0 ; i < a ; i++){
            prod = prod + arr[i];
            prod = prod * 10 ;
        }

        prod = prod / 10;

        if(prod > INT_MAX)return -1;

        return prod  ;

    }
};