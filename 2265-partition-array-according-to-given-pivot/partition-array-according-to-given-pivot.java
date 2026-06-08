class Solution {
    public int[] pivotArray(int[] nums, int pivot) {


        // optimize yehi hua na ki use second array stor the result 

        int leftI = 0 ;
        int rightI = nums.length - 1 ;

        int i = 0 ; 
        int j = nums.length - 1; 

        int[] ans = new int[rightI+1];

        while(i < nums.length && j >= 0 ){

            if(nums[i] < pivot){
                ans[leftI++] = nums[i];
            }

            if(nums[j] > pivot){
                ans[rightI--] = nums[j];
            }

            i++;
            j--;
 
        }

        while(leftI <= rightI){
            ans[leftI++] = pivot ;
        }

        // System.out.println(Arrays.toString(ans));
        return ans ; 
        
    }
}