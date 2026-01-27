class Solution {

    public List<List<Integer>> perm(int[] nums, List<Integer> list, int[] arr, List<List<Integer>> lists) {

        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return lists;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = -1;

                list.add(nums[i]);

                perm(nums, list, arr, lists);

                list.remove(list.size() - 1);

                arr[i] = 0;
            }

        }

        return lists;

    }

    public List<List<Integer>> permute(int[] nums) {

        int[] arr = new int[nums.length];

        return perm(nums,new ArrayList<>() , arr, new ArrayList<>());

    }
}