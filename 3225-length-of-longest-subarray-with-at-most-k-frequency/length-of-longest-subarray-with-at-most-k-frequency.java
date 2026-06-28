class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int start = 0 ;
        int max = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            
            map.put(nums[i] , map.getOrDefault(nums[i], 0)+1);
            
            if(map.get(nums[i]) > k){
                while(nums[start] != nums[i]){
                    map.put(nums[start], map.get(nums[start]) - 1);
                    start++;
                }
                map.put(nums[i] , map.get(nums[i]) - 1);
                start++;
            }
            
            max = Math.max(max , i - start + 1);
            
        }

        return max ; 

    }
}