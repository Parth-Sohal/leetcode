class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            mpp.put(nums[i] , i);
        }

        int[] ans = new int[2];

        for(int i = 0 ; i < nums.length ; i++){
            int complement = target - nums[i];

            if(mpp.containsKey(complement) && mpp.get(complement) != i){
                ans[0] = i;
                ans[1] = mpp.get(complement);
                return ans ;
            }

        }

        return ans ;

    }
}