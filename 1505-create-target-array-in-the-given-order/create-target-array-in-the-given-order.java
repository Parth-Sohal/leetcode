class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr = new ArrayList<>(nums.length);

        for(int i = 0 ; i < nums.length ;i++){
            // insert karwana hai
            int element = nums[i];
            int Currentidx = index[i];

            arr.add(Currentidx, element);
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}