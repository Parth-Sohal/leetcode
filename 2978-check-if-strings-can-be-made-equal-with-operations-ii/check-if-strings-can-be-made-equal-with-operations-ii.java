class Solution {
    public boolean checkStrings(String s1, String s2) {


        HashMap<Character , Integer> even = new HashMap<>(); 
        HashMap<Character , Integer> odd =  new HashMap<>(); 


        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i) ;
            
            if(i%2 == 0){
                even.put(ch , even.getOrDefault(ch , 0)+1);            
            }

            else{
                odd.put(ch , odd.getOrDefault(ch , 0)+1);   
            }
        }


        for(int j = 0 ; j < s2.length() ; j++){


            char ch = s2.charAt(j) ;


            if(j % 2 == 0){ // even


                if(!even.containsKey(ch) || even.get(ch) == 0)return false ;
                even.put(ch , even.get(ch) - 1);
                
            }else{
                if(!odd.containsKey(ch) || odd.get(ch) == 0)return false ;
                odd.put(ch , odd.get(ch) - 1);
            }
            
        }


        return true ; 

        


        


        
    }
}