class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character , Integer > mpp = new HashMap<>()  ;

        int start = 0 ;
        int max = 0 ; 


        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i) ;

            if(mpp.containsKey(ch)){
                start = Math.max(start , mpp.get(ch) + 1) ;
            }

            mpp.put(ch , i);
        
            max = Math.max(max, i - start + 1);


        }

        return  max ;  
      
        
    }
}