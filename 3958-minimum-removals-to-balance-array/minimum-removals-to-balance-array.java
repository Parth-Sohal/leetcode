class Solution {

    public int bs(int[] nums , int low , int high , long target){

        if(low > high)return -1; 

        while(low <= high){

            int mid =  (low + high ) / 2 ; 

            if((long)nums[mid] <= target){
                low = mid + 1;
            }

            else{
                high = mid - 1; 
            }
                   
        }

        return high ; 
        
        
    }
    
    
    public int minRemoval(int[] nums, int k) {
        int n = nums.length ; 
        if(n <= 1 ){
            return 0 ; 
        }

        Arrays.sort(nums);

        int max = 0 ; 

        for(int i = 0 ; i < n ; i++){

            
            int idx = bs(nums, i , n-1 , (long)nums[i]*k) ;

            System.out.println(idx);

            max = Math.max(max , ( idx - i + 1) );

            
            
        }

        return n - max ; 

       

    }

    

}