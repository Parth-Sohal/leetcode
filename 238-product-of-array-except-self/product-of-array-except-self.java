class Solution {
    public int[] productExceptSelf(int[] nums) {
        

        // brute can go 
        // like create a new array and then add then go nested loops 
    
        int n = nums.length ;
        int[] prefixArray = new int[n];
        int prod = 1 ; 
        
        for(int i = 0 ; i < n ; i++){
            prefixArray[i] = prod ;
            prod = prod * nums[i];
        }

        prod = 1 ; 

        for(int i = n-1 ; i >= 0 ; i--){

            int ele = nums[i];
            nums[i] = prod * prefixArray[i];
            prod = prod * ele;

        }

        return nums ;

    }
}