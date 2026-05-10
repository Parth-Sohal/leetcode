class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {


        HashMap<Character,Integer> mpp = new HashMap<>() ;
        int max = -1 ;

        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i) ;
            
            if(mpp.containsKey(ch)){
                max = Math.max(max ,i - mpp.get(ch) - 1 ) ; 
            }

            else{
                mpp.put(ch, i);
            }

        }


        return max ; 
        
    }
}