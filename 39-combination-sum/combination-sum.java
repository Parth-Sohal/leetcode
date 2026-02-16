class Solution {

    public  List<List<Integer>> combination1(int[] arr , int idx , List<Integer> list ,  int sum ,int k , List<List<Integer>> lists ){
        
        if(sum > k)return lists;
        
        if(sum == k){
            // System.out.println(list);
            lists.add(new ArrayList<>(list) );
            return lists;
        }
        
        
        for(int i = idx ; i < arr.length ; i++){
            list.add(arr[i]);
            combination1(arr,i ,list,sum+arr[i] ,k ,lists);
            list.remove(list.size() - 1);
        }
        
        
        return lists;
        
        
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return combination1(candidates , 0 , new ArrayList<>(),  0 ,target  , new ArrayList<>() );
    }
}