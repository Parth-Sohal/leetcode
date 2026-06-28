class Solution {
    public int minDeletions(String s) {
        

        int[] count = new int[26] ;

        for(char c : s.toCharArray()){
            count[c - 'a']++ ;
        }

        HashSet<Integer> set = new HashSet<>() ;

        Arrays.sort(count) ;
        int ans = 0 ; 

        for(int i = count.length - 1 ; i >= 0 ; i--){

            int n = count[i] ;


            while(set.contains(n) && n > 0){
                n = n - 1  ;
                ans++ ;
            }

            if(n >= 1)set.add(n);

        }


        return ans ; 

    }
}