class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        int peak = -1;
        for(int i = 1 ; i < arr.size()-1 ;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                peak = i;
            }
        }
        if(peak == -1){
            return false;
        }

        // small]
        int i = peak ;
        while(i > 0){
            if(arr[i-1] > arr[i] || arr[i-1] == arr[i]){
                return false;
            }
            i--;
        }
        int j = peak;
        while(j < arr.size()-1){
            if(arr[j] < arr[j+1] || arr[j] == arr[j+1]){
                return false;
            }
            j++;
        }

        return true;
    }

};