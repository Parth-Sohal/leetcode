class Solution {
    
    
    public int longestConsecutive(int[] nums) {


        HashSet<Integer> set = new HashSet<>() ;


        for(int i : nums){
            set.add(i);
        }

        int max = 0 ; 

        for(int i : set){

            if(!set.contains(i-1)){
                int temp = 0 ; 
                int j = i ; 

                while(set.contains(j)){
                    temp++;
                    j++;
                    // set.remove(j);
                }


                max = Math.max(temp , max);
            }
            
        }

        return max ; 
        
        
    }
}