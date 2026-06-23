class NumArray {

    int[] pfArray ; 

    public NumArray(int[] nums) {
        pfArray = new int[nums.length + 1] ;
        int sum = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            pfArray[i+1] = sum ;
        }

    }
    
    public int sumRange(int left, int right) {
        return pfArray[right+1] - pfArray[left]; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */