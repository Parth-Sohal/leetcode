class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
         int max = 0 ;
        int start = 0 ;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            int n = nums[i];
            
            map.put(n, map.getOrDefault(n, 0)+1);
            
            while(map.get(n) > k){
                
                int num = nums[start] ;
                map.put(num, map.get(num) - 1);
                start++;
                
            }
            
            max = Math.max(max , i - start + 1);
            
            
        }
        
        return max ; 

    }
}