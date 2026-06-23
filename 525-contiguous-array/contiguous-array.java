class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer , Integer> mpp = new HashMap<>() ;
        mpp.put(0 , -1) ;


        int sum = 0 ;
        int max  = 0 ;  

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == 0){
                sum += -1 ;
            }
            else{
                sum += 1 ;
            }

            int temp = sum - 0 ; 

            if(mpp.containsKey(temp)){
                max = Math.max(max , i - mpp.get(temp));
            }


            if(!mpp.containsKey(sum)){
                mpp.put(sum , i);
            }

        }
        
        return max ;
    }
}