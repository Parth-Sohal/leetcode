class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0 ;
        for(Integer key : map.keySet()){
            int value = map.get(key) ;
            count   += (value * (value - 1))/ 2;
        }

        return count ;
    }
}