class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        

        List<Integer> ans = new ArrayList<>() ;

        int small = 0 ; 
        int large = 0 ; 
        int n = nums.length ; 



        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] < target)small++;
            else if(nums[i] > target)large++;
        }


        for(int i = small ; i < n - large ; i++){
            ans.add(i);
        }

        return ans ; 

    }
}