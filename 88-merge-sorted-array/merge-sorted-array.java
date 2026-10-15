class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // again brute add all eleents from last in array and sort the compleete array 

        int i = m-1 ; // nums1 
        int j = n - 1 ;//last nums2 
        int put = nums1.length -1 ; 

        while(i >= 0 && j >= 0){

            if( nums2[j] >= nums1[i] ){
                nums1[put--] = nums2[j--];
            }

            else{
                nums1[put--] = nums1[i--];
            }

        }


        while(j >= 0){
            nums1[put--] = nums2[j--];
        }



    }
}