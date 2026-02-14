class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mppStoT = new HashMap<>();
        HashMap<Character,Character> mppTtoS = new HashMap<>();


        for(int i = 0 ; i < s.length() ; i++){


            char a = s.charAt(i);
            char b = t.charAt(i);

            if(mppStoT.containsKey(a) && mppStoT.get(a) != b){
                return false ;
            }
            
            if(mppTtoS.containsKey(b) && mppTtoS.get(b) != a){
                return false ;
            }

            mppTtoS.put(b,a);
            mppStoT.put(a,b);


        }

        return true ;
    }
}