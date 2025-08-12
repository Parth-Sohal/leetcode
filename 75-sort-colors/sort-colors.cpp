class Solution {
public:
    void dutchFLag(vector<int>& arr){
        int low = 0 ;
        int mid = 0 ;
        int high = arr.size() - 1 ;  // mid to high taak unsorted 
        // low se phele 0 aur low se mid ke beck me 1 
        while( mid <= high ){
            if(arr[mid] == 1) mid++;
            else if (arr[mid] == 0) swap(arr[mid++],arr[low++]);
            else swap(arr[mid],arr[high--]);
        }
    }


    void dutcjhFlag2(vector<int>& arr){

        int low = 0 ; 
        int mid = 0 ; 
        int n = arr.size() ;
        int high = n - 1 ;


        while( mid <= high ){

            if(arr[mid] == 0){
                swap(arr[low],arr[mid]);
                mid++;
                low++;
            }

            else if(arr[mid] == 1){
                mid++;
            }

            else{
                swap(arr[mid],arr[high]);
                high--;
            }

        }




    }




    void sortColors(vector<int>& nums) {
        
        // method one  i will count 0 , 1 and 2 and explitclity put in poo
        // int countZero = 0 ;
        // int countOne = 0 ;
        // int countTwo = 0 ;
        // for(int i = 0 ; i < nums.size() ;i++){
        //     if(nums[i] == 0){
        //         countZero++;
        //     }else if(nums[i] == 1){
        //         countOne++;
        //     }else{
        //         countTwo++;
        //     }
        // }
        // for(int i = 0 ; i < nums.size() ;i++){
        //     if( i < countZero){
        //         nums[i] = 0;
        //     }else if( i < countZero + countOne){
        //         nums[i] = 1;
        //     }else{
        //         nums[i] = 2;
        //     }
        // }

        // method 2 
        // i pointer jo vhalewg a high se age 2 low se phel 0 

        dutcjhFlag2(nums);


    }
};