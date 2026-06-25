class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int i = 0 ;
        int j = 0 ;
        long sum = 0 ;
        long max = 0 ; 

        while(j < nums.length){

            int val = nums[j] ;
            sum += val;

            if(map.containsKey(val)){
                while(nums[i] != val){
                    map.remove(nums[i]);
                    sum -= nums[i];
                    i++;
                }

                map.remove(val);
                sum -= val ;
                i++;
            }

            else if(j-i+1 > k){
                map.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            map.put(val,j);



            if(j-i+1 == k){
                max = Math.max(max,sum);
            }
            
            j++;

        }

        return max ; 
    }
}