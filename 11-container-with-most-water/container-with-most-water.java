class Solution {
    public int maxArea(int[] height) {
        int low = 0 ; 
        int high = height.length - 1;

        int maxWater = 0 ; 

        while(low < high){

            int len = (high - low );
            int ans = len * Math.min(height[low] , height[high]);

            maxWater = Math.max(maxWater , ans) ;


            if(height[low] <= height[high])low++;
            else high--;
            
        }


        return maxWater ;
        
        
    }
}