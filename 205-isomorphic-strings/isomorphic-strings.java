class Solution {

    public static boolean isomorphic(String a , String b){

            // e g g // a d d


        // e - a
       // g - d

       if(a.length()!=b.length()){
           return  false;
       }

       int n = a.length();
       HashMap<Character,Character> mapAtoB = new HashMap<>();
       HashMap<Character,Character> mapBtoA = new HashMap<>();

       for(int i=0;i < n ;i++){

           char c1 =  a.charAt(i) ;
           char c2 =  b.charAt(i) ;

           if(mapAtoB.containsKey(c1) && mapAtoB.get(c1) != c2){
               return false; 
           }
           
           if(mapBtoA.containsKey(c2) && mapBtoA.get(c2) != c1) {
               return false;
           }
           
           mapAtoB.put(c1,c2);
           mapBtoA.put(c2,c1);
           
       }

       return true;
       
   }

    public boolean isIsomorphic(String s, String t) {
        return isomorphic(s,t); 
    }
}