class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mpp = new HashMap<>() ;
        int sum = 0 ; 
        int total = 0 ; 

        mpp.put(0 , 1);
        
        for(int i : nums){

            sum += i ; 

            if(mpp.containsKey(sum - k )){
                total += mpp.get(sum - k);
            }

            mpp.put(sum , mpp.getOrDefault(sum , 0)+1);

        } 

        return total ; 

    }
}