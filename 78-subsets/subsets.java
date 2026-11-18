class Solution {

    public List<List<Integer>> subset(int[] nums, int idx, List<List<Integer>> list, List<Integer> temp) {

        if (idx >= nums.length) {
            list.add(new ArrayList<>(temp));
            return list;
        }

        subset(nums, idx + 1, list, temp);

        temp.add(nums[idx]);
        subset(nums, idx + 1, list, temp);
        temp.removeLast();

        return list ;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return  subset(nums , 0 , new ArrayList<>() , new ArrayList<>());
    }
}