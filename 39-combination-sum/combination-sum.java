class Solution {

    public  List<List<Integer>> sum(int[] arr , int currSum ,int target , List<Integer> list, int idx , List<List<Integer>> lists) {

        if(currSum == target){
            // System.out.println(list);
            lists.add(new ArrayList<>(list));
            return lists;
        }

        if(currSum > target){
            return lists;
        }

        for(int i = idx ; i < arr.length ; i++){
            list.add(arr[i]);
            sum(arr,currSum+arr[i],target,list,i,lists);
            list.remove(list.size()-1);
        }

        return lists;

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return sum(candidates,0,target, new ArrayList<>() ,0,new ArrayList<>());
    }
}