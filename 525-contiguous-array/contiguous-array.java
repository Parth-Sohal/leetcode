class Solution {
    public int findMaxLength(int[] nums) {

        // 0 - -1

        HashMap<Integer, Integer> map = new HashMap<>() ;
        int max = 0  , n = nums.length; 
        map.put(0 , -1) ;
        int sum = 0 ; 


        for(int i = 0 ; i < n ; i++){

            if(nums[i] == 0)sum -= 1 ; 
            else sum += 1 ; 

            if(map.containsKey(sum)){
                
                max = Math.max(max , i - map.get(sum)) ;

            }else{
                map.put(sum , i);
            }

        }

        return max ; 


        
    }
}