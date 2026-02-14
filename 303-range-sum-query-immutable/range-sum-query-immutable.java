class NumArray {

    int[] arr ; 
    
    public NumArray(int[] nums) {

        arr = nums;
        
        
    }

    public int sumRange(int left, int right) {
        
        if(left == right){
            return arr[left];
        }
        
        if(left > right){
            return -1;
        }
        
        if(left < 0 || right > arr.length-1){
            return -1;
        }
        
        int sum = 0 ;
        
        for(int i =left ; i<= right; i++){
            sum += arr[i];
        }
        
        return sum;
        
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */