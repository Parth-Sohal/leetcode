class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int idxDiff, int valDiff) {

        int start = 0 ;
        int j = 0 ;

        TreeSet<Long> map = new TreeSet<>();

        while(j < nums.length){

            if(j - start > idxDiff){
                map.remove((long)nums[start]);
                start++;
            }

            long x = nums[j];

            Long floor =  map.floor(x) ;
            Long ceil =  map.ceiling(x) ;

            if(floor != null && nums[j] - floor <= valDiff){
                return true ;
            }
            if(ceil != null && ceil - nums[j] <= valDiff){
                return true ;
            }

            map.add((long)nums[j]);
            j++;

        }

        return false ; 

    }


}