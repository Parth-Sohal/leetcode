class Solution {

    static void subset(int[] num , int idx , ArrayList<Integer> list ,List<List<Integer>> ans ){
        if(idx == num.length){

            ans.add(list);

            return ;
        }

        subset(num, idx + 1, list , ans);
        ArrayList<Integer> newList = new ArrayList<>(list);
        newList.add(num[idx]);
        subset(num, idx + 1, newList ,ans);
    }

    public List<List<Integer>> subsets(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums , 0 , list , ans  );
        return ans ; 
        
    }
}