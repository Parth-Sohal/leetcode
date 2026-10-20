class NumArray {

    int[] arr ;
    int[] prefixArray ;
    
    public NumArray(int[] nums) {
        arr =  nums;
        prefixArray = new int[nums.length+1];
        prefixArray[0] = 0;
        prefixSum();
    }

    private void prefixSum(){
        
        int sum = 0 ; 
        
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            prefixArray[i+1] = sum;
        }
        
    }
    
    public int sumRange(int left, int right) {
        return prefixArray[right+1] - prefixArray[left];
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */