class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans = new ArrayList<>() ; 
        int max = Arrays.stream(candies).max().getAsInt()  ;


        for(int i : candies){

            int val = i + extraCandies ;


            if(val >= max){
                // max = val ;
                ans.add(true);
            }

            else{
                ans.add(false); 
            }


        }


        return ans ; 

    }
}