class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {


        int[] arr = new int[nums.size()] ;


        for(int i = 0 ; i < nums.size() ; i++){

            int j = nums.get(i);
            int k = 1 ;

            while( (j & k) != 0 ){
                k = k << 1;
            }
            

            k = k >> 1 ;

            k = k ^ j ;

            if( ((k) | (k+1)) == j)
            {
                arr[i] = k ;
            }

            else{
             arr[i] = -1;
            }

        }

        return arr ; 
        
    }
}