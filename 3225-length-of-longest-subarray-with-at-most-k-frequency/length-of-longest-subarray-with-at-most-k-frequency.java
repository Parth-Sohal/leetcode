class Solution {
    public int maxSubarrayLength(int[] nums, int k) {


        // the value of each element should come only till k 

        int max = Integer.MIN_VALUE ;  
        int start = 0 ; 
        HashMap<Integer , Integer> map = new HashMap<>() ;

        for(int i = 0 ; i < nums.length ; i++){

            int val = nums[i] ;
            map.put(val , map.getOrDefault(val,0) + 1);

            while(map.get(val) > k){
                
                int numStart = nums[start];
                map.put(numStart , map.get(numStart)  - 1) ;
                start++ ;

            }

            max = Math.max(max , i - start + 1);


        }

        return max ; 
        
    }
}