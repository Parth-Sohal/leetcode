class Solution {

    public  void combinationhelper3(int sum , int count ,  int idx ,  int k , int n , List<Integer> list , List<List<Integer>> lists){


        if(list.size() == k && sum == n){
            System.out.println(list + " " + sum);
            lists.add(new ArrayList<>(list));
            return;
        }

        if(sum >= n || count > k){
            return ;
        }

        for(int i = idx ; i <= 9 ; i++){
            list.add(i);
            combinationhelper3(sum+i , count+1 , i+1 , k , n , list ,lists);
            list.removeLast();
        }

   }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =  new ArrayList<>() ;
        combinationhelper3(0,0, 1 , k , n, new ArrayList<>() , ans);
        return ans ; 
    }
}