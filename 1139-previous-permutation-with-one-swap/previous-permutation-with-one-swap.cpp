class Solution {
public:
    vector<int> prevPermOpt1(vector<int>& arr) {

        int idx = -1;
        int n = arr.size();

        for(int i = n - 2 ; i >=0 ;i--){
            if(arr[i] > arr[i+1]){
                idx = i;
                break ;
            }
        }

        if(idx == -1)return arr;

        else{
            int i = n - 1;
            while(i > idx){
                if(arr[i] < arr[idx]){
                    while(i > idx && arr[i-1]==arr[i]){
                        i--;
                    }
                    swap(arr[i],arr[idx]);
                    break;
                }
                i--;
            }
        }

        return arr;




        
    }
};