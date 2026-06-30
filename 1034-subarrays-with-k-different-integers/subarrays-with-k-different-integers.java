class Solution {

    public int helper(int[] nums, int k) {
        // at most k - at most k - 1 s

        if(k == 0)return 0 ; 

        int ans = 0 ;
        int start = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            int n =  nums[i];
            map.put(n,map.getOrDefault(n,0)+1);

            while(map.size() > k){
                int num = nums[start++];
                map.put(num,map.getOrDefault(num,0)-1);
                if(map.get(num) == 0){
                    map.remove(num);
                }
            }

            ans += (i - start + 1);

        }
        
        return ans;


    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        // at most k - at most k - 1 

        return helper(nums,k) - helper(nums,k-1) ;
    }
}