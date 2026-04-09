class Solution {
    public int trap(int[] arr) {

        int leftMax = arr[0];
        int rightMax = arr[arr.length  - 1] ;

        int i = 0 ;
        int j = arr.length - 1 ;
        int count = 0 ;

        while(i < j){

            if(leftMax <= rightMax){
                i++;
                leftMax = Math.max(leftMax,arr[i]);
                count += (leftMax - arr[i]);
            }

            else{
                j--;
                rightMax = Math.max(rightMax,arr[j]);
                count += (rightMax - arr[j]);
            }

        }

        return count ; 

    }
}