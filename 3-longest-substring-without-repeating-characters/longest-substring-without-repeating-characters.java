class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> mpp = new HashMap<>();
        int max = 0 ;
        int start = 0 ;


        for(int i = 0 ; i < s.length() ; i++){

            if(mpp.containsKey(s.charAt(i))){
                start = Math.max(mpp.get(s.charAt(i))+1 ,start);
            }   


            max = Math.max(max , i - start+1);
            mpp.put(s.charAt(i) , i);
        }


        return max ;

     

    }
}