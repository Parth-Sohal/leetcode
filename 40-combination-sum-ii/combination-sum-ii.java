class Solution {

    public List<List<Integer>> combinationSumII(int[] arr, int k, int idx, int sum, List<Integer> list,
            List<List<Integer>> lists) {

        if (sum > k) {
            return lists;
        }

        if (sum == k) {
            // System.out.println(list);
            lists.add(new ArrayList<>(list));
            return lists;
        }

        for (int i = idx; i < arr.length; i++) {

            if (i == idx || arr[i] != arr[i - 1]) {
                list.add(arr[i]);
                combinationSumII(arr, k, i + 1, sum + arr[i], list, lists);
                list.removeLast();

            }

        }

        return lists;

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        return combinationSumII(candidates, target, 0, 0, new ArrayList<>(), new ArrayList<>());

    }
}