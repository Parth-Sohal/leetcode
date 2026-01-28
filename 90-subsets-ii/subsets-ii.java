class Solution {

    public List<List<Integer>> subset(int[] arr, int idx, List<Integer> list, HashMap<List<Integer>, Integer> map, List<List<Integer>> lists) {


        if (idx == arr.length) {
            List<Integer> temp = new ArrayList<>(list);
            if (map.containsKey(temp)) {
                return lists;
            }
            map.put(temp, 1);
            // System.out.println(temp);
            lists.add(temp);
            return lists;

        }


        subset(arr, idx + 1, list, map, lists);
        list.add(arr[idx]);
        subset(arr, idx + 1, list, map, lists);
        list.removeLast();

        return lists;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        HashMap<List<Integer>, Integer> map = new HashMap<>();

        return (subset(nums, 0, new ArrayList<>(), map, new ArrayList<>()));
        
    }
}