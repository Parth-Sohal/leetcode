class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0 , currSum = 0 ; 

        map.put(0,1);

        for(int i = 0 ; i < nums.length ; i++){

            currSum += nums[i];

            int complement = currSum - k ; 


            if(map.containsKey(complement)){
                ans += map.get(complement);
            }

            map.put(currSum , map.getOrDefault(currSum,0) + 1);

        }
        
        return ans ;

    }
}