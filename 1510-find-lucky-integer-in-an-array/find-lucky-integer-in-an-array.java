class Solution {
    public int findLucky(int[] arr) {


        int[] map  = new int[501] ;

        for(int i : arr){

            map[i]++;
        }

        // System.out.println(mpp);
        

        int val = -1 ;
        for(int i :  arr){
            
            if(map[i] == i && i > val){
                val = i ;
            }
                
        }

        return val ; 

        
    }
}