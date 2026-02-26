class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        if(s.length() == 0)return 0 ;

        HashMap<Character , Integer> mpp = new HashMap<>();
        int max = 0 ;
        int start = 0 ;

        // mpp.put(s.charAt(0) , 0) ;

        for(int i = 0 ; i < s.length() ; i++){


            if(mpp.containsKey(s.charAt(i))){
                start = Math.max(start, mpp.get(s.charAt(i)) + 1);
            }



            max = Math.max(max , i - start + 1 );
            mpp.put(s.charAt(i) , i);

        }

        return max ; 



    }
}
