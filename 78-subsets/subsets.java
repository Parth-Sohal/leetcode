class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> lists  = new ArrayList<>(); 


        for(int i = 0 ; i < (1 << nums.length) ; i++){

            List<Integer> list = new ArrayList<>();

            int post = 0 ;
            int temp = i ;

            while(temp != 0){

                if((temp & 1) == 1){
                    list.add(nums[post]);
                }

                temp = temp >> 1;
                post++;
            }
            

            lists.add(list);

        }

        return lists ;

        
    }
}