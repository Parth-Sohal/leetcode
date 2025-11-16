class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int idx = nums[i];
            // if at place

            if (nums[i] == nums[idx - 1]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[idx - 1];
                nums[idx - 1] = temp;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != (j+1)){
                list.add(j+1);
            }
        }

        return list ; 



    }
}