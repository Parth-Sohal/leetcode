class Solution {
    public void nextPermutation(int[] nums) {
       
        int idx = nums.length-2;


        while(idx >= 0){

            if(nums[idx] < nums[idx+1]){

                int j = nums.length-1;

                while( j > idx ){

                    if(nums[j] > nums[idx]){
                        int tmp = nums[j];
                        nums[j] = nums[idx];
                        nums[idx] = tmp;
                        break;
                    }
                    j--;
                }

                break;

            }

            idx--;

        }

        System.out.println(Arrays.toString(nums));



        int i = idx+1 ;
        int j = nums.length-1;

        while( i < j ){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }


    }
}