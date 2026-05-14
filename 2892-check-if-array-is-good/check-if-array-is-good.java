class Solution {
    public boolean isGood(int[] nums) {

        int max = Arrays.stream(nums).max().getAsInt();


        if(nums.length != max + 1){
            return false ;
        }


        HashMap<Integer,Integer> mpp = new HashMap<>() ;


        for(int i : nums)
        {

            if(i > max || mpp.containsKey(i) && i < max){
                return false ;
            }


            if(mpp.containsKey(i) && i == max){
                if(mpp.get(i) >= 2){
                    return false;
                }
            }

            mpp.put(i , mpp.getOrDefault(i,0) + 1) ;

        }

        return true ; 

    }
}