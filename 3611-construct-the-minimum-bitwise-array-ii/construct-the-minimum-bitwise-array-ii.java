class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
         int[] ans = new int[nums.size()];
        int idx = 0 ;
        for(int i : nums) {

            int k = i ;
            int j = 1 ;


            while((k & j) != 0) {
                j = j << 1;
            }

            j  = j >> 1;

            k = j ^ k ;

            if((k | k + 1) == i){
                ans[idx++] = k ;
            }

            else{
                ans[idx++] = -1;
            }
            
        }

        return ans ;
    }
}