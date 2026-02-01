class Solution {

    public  List<List<Integer>> printSubsequnce1(int[] arr, int idx, ArrayList<Integer> list, List<List<Integer>> lists) {

        if (idx == arr.length) {
            // System.out.println(list);
            lists.add(new ArrayList<>(list));
            return lists;
        }


        // exculde

        printSubsequnce1(arr, idx + 1, list, lists);

        // include

        list.add(arr[idx]);
        printSubsequnce1(arr, idx + 1, list, lists);
        list.remove(list.size() - 1);

        return lists;

    }


    public List<List<Integer>> subsets(int[] nums) {
        return printSubsequnce1(nums,0,new ArrayList<>() , new ArrayList<>()); 
    }
}