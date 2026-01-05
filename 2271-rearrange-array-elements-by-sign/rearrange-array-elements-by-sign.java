class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int posIdx = 0 ;
        int negIdx = 0 ;

        for(int i : nums){
            if(i < 0){
                neg[negIdx++] = i;
            }else{
                pos[posIdx++] = i;
            }
        }

        int j = 0 ;
        posIdx = 0 ;
        negIdx = 0 ;


        while(j < n){

            nums[j] = pos[posIdx];
            j++;
            nums[j] = neg[negIdx];
            j++;
            posIdx++;
            negIdx++;
        }

        return nums; 

    }
}