class Solution {
    public boolean isTrionic(int[] nums) {

        if(nums.length == 3)return false; 
        int n = nums.length ; 
        int i = 1 ;
        while((i < n) && (nums[i] > nums[i-1])){
            i++ ;
        }
        int p = i - 1   ;
        if(p == 0 || p == n-1) return false; 
        while((i < n) &&  (nums[i] < nums[i-1]) ) {
            i++;
        }

        int q = i - 1 ;

        if( q == p || q == n - 1) return false ; 


        while((i < n) && (nums[i] > nums[i-1])){
            i++;  
        }

        if( i == n )return true ;

        return false ; 

    }
}