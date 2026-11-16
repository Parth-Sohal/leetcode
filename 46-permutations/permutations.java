class Solution {

    public void perm(int[] nums , int idx , List<Integer> list ,List<List<Integer>> answer){
        
        if(idx == nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = idx ; i < nums.length ; i++){
            
            // swap idx with i
            int temp =  nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            
            
            list.add(nums[idx]);
            perm(nums , idx+1 , list , answer);
            list.removeLast();
            
            //swap again
            temp =   nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        perm(nums , 0 , new ArrayList<>() , ans);
        return ans ; 
    
    }
}