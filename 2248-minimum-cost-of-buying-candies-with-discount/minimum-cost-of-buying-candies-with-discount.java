class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int ans = 0 ;
        int i = cost.length - 1 ; 


        while(i >= 0){

            ans += cost[i] ;
            i--;

            if(i >= 0)ans += cost[i] ;

            i = i - 2 ; 
        }

        return ans ; 

    }
}