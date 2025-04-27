class Solution {
public:
    bool isArraySpecial(vector<int>& nums) {
        int i = 0 ;
        int j = 1;

        int n = nums.size();
        if(n == 1) return true;

        while(j < n){
            int prod = nums[i] * nums[j];
            if(prod % 2 != 0){ 
                return false;
            }
            if((nums[i]%2==0 && nums[j]%2==0) || (nums[i]%2!=0 && nums[j]%2!=0)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
};