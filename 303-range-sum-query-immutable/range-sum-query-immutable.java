class NumArray {

    int[] arr ; 
    int[] prefixArray ;
    
    public NumArray(int[] nums) {

        arr = nums;
        prefixArray = new int[arr.length] ;
        int sum = 0 ;

        for(int i = 0; i <  arr.length ; i++){
            sum += arr[i];
            prefixArray[i] = sum ; 
        }
    
    }

    public int sumRange(int left, int right) {
        

        if(left == 0){
            left = 0;
        }else{
            left = prefixArray[left - 1];
        }

        right = prefixArray[right];

        return right - left ; 
        
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */