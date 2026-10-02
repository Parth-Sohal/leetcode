class Solution {
    public int subarraySum(int[] nums, int k) {

        int ans = 0 ; 
        // prefix sum 

        HashMap<Integer, Integer> map = new HashMap<>();

        int currSum = 0 ; 
        map.put(0 , 1) ;


        for(int i = 0 ; i < nums.length ; i++){

            currSum += nums[i] ;


            int valNeeded =  currSum - k ; 

            if(map.containsKey(valNeeded) ) {
                ans += map.get(valNeeded);
            }

            map.put(currSum , map.getOrDefault(currSum,0) + 1);


        }
        return ans ; 


        
    }
}