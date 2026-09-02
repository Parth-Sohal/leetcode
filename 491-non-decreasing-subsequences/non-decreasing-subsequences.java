class Solution {

    public static void dfs(int[] nums, int idx , List<Integer> list,
            List<List<Integer>> ans) {

        if (list.size() >= 2) {

            ans.add(new ArrayList<>(list));
            // set.add(num);

        }


        Set<Integer> used  = new HashSet<>() ;
        // main

        for (int i = idx; i < nums.length; i++) {

            if(used.contains(nums[i]) ){
                continue ; 
            }

            if (list.isEmpty() || nums[i] >= list.getLast()) {
                used.add(nums[i]);
                list.add(nums[i]);
                dfs(nums, i + 1  , list, ans);
                list.removeLast();
            }

        }

    }

    public List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        dfs(nums, 0 , list, ans);

        return ans ; 

    }
}