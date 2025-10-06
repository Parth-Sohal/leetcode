class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = -1 ;

        while(low <= high){
            int mid = (low+high)/2;
            int count = 0;
            for(int i = 0 ; i < nums.length ;i++){
                count += (nums[i] + mid - 1)/ mid ;
            }

            if(count > threshold){
                low = mid + 1;
            }

            else{
                ans = mid ;
                high = mid - 1;
            }

        }

        return ans;

    }
}