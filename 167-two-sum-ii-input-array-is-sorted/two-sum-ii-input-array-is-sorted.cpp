class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        // vector<int> ans ;  
        // int i = 0 ;
        // int j = numbers.size()-1;


        // while(i < j ){
        //     int sum = numbers[i] + numbers[j];

        //     if(sum == target){
        //         return {i+1,j+1};
        //     }

        //     else if( sum > target ){
        //         j--;
        //     }
        //     else{
        //         i++;
        //     }
        // }

        // return ans;

        // binary search mathod

        for(int i = 0 ; i < numbers.size() ;i++){
            int j = i+1;
            int k = numbers.size() - 1 ; 


            // binarty search 
            while(j <= k){

                int mid = (j + k) / 2 ;

                if(numbers[mid] == target - numbers[i]){
                    return {i+1 , mid+1};
                }

                else if(numbers[mid] > target - numbers[i]){
                    k = mid - 1;
                }

                else{
                    j = mid + 1;
                }

            }
        }

        return {};

    }
};