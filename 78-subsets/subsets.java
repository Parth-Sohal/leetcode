class Solution {

    public static List<List<Integer>> printSubseq(int[] nums , int idx , List<Integer> list , List<List<Integer>> lists){

        if(idx == nums.length){
            lists.add(new ArrayList<>(list));
            return lists;
        }

        list.add(nums[idx]);
        printSubseq(nums, idx+1, list,lists);
        list.removeLast();
        printSubseq(nums, idx+1, list,lists);

        return lists;

    } 

    public List<List<Integer>> subsets(int[] nums) {
        return printSubseq(nums,0,new ArrayList<>() , new ArrayList<>());
    }
}