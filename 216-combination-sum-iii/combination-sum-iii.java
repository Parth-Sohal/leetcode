class Solution {
    public static List<List<Integer>> sum3( int idx , int n , int k , int sum , List<Integer> list , List<List<Integer>> lists ){


        if(sum>n)return lists;

        if(list.size() == k){
//            System.out.println(list);
            if(sum == n){
                lists.add(new ArrayList<>(list));
//                System.out.println("Real ans : " + list);
            }
            return lists;
        }


        for(int i = idx ; i <= n && i <= 9 ; i++){
            list.add(i);
            sum3(i+1 , n , k , sum + i ,list ,lists );
            list.remove(list.size() - 1);
        }


        return lists ;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        return sum3(1,n,k,0,new ArrayList<>() , new ArrayList<>()) ;
    }
}