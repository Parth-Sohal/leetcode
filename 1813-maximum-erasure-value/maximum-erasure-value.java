class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        HashMap<Integer , Integer>  mpp = new HashMap<>() ;

        int start = 0 ; 
        int max = 0 ; 
        int sum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            int n = nums[i]; 
            sum += nums[i] ;

            if( mpp.containsKey(n) ){
                
                int idx = mpp.get(n) ;

                if( idx >= start ){
                    while(start <= idx){
                        sum -= nums[start++] ;
                    }
                }

            }

            max = Math.max(max , sum);
            mpp.put(nums[i] , i);
        }
        
        return max;  

    }
}