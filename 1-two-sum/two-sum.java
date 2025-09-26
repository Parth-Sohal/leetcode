class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],i);
        }

        int[] temp = new int[2];

        for(int i = 0 ; i < nums.length ; i++){
            int sub = target - nums[i];
            if(map.containsKey(sub) &&( map.get(sub) != i)){
                temp[0] =  i;
                temp[1] = map.get(sub);
                return temp;
            }
        }

        return temp;


    }
}