class Solution {
    public int[] arrayRankTransform(int[] arr) {


        // variables 
        if(arr == null || arr.length == 0) return arr ;  // edge 

        int[] ans = arr.clone() ; // shalow copy 
        Arrays.sort(ans);
        HashMap<Integer, Integer> map = new HashMap<>() ;  // map rank each element 
        int rank = 0 ;  // it 
        int prev = Integer.MIN_VALUE ;  //.. just t  track 


        for(int i = 0 ; i < ans.length ; i++){ // n element 

            if(ans[i] != prev){
                rank++;
                prev = ans[i]; 
            }

            map.put(ans[i] , rank) ;

        }

        for(int i = 0 ; i < arr.length ; i++){ // n element 
            ans[i] = map.get(arr[i]) ;
        }


        return ans ; 

    }

    // tc O(nlong)  + o(2n)
    // o(n) + o(n) 
}