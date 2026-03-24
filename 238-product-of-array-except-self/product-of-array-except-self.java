class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prf =  new int[nums.length];
        prf[0] = 1;

        for(int i = 1 ; i < nums.length ; i++){

            prf[i] = prf[i-1] * nums[i-1];
        }

        // System.out.println(Arrays.toString(prf));

        int prd = 1 ;

        for(int i = prf.length - 1 ; i >= 0 ; i--){
            prf[i] = prf[i] * prd;
            prd *= nums[i];
        }

        return prf ; 
    }
}