class Solution {
    
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int currSum = 0 ;
        map.put(0,-1);


        for(int i = 0; i < nums.length; i++){

            currSum += nums[i];
            int mod = currSum % k ;

            if(map.containsKey(mod)){

                int lastIdx = map.get(mod);

                if(i - lastIdx  >= 2  ){
                    return true;
                }

            }

            else{
                map.put(mod,i);
            }

        }


        return false;
    }
}