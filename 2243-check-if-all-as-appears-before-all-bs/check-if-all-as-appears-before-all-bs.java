class Solution {
    public boolean checkString(String s) {
        int firstB =-1 ; 
        // int  =-1;


        for(int i = 0; i < s.length() ; i++){

            if(s.charAt(i) == 'a'){
                if(firstB != -1 && i > firstB){
                    return false;
                } 
            }

            if(s.charAt(i) == 'b' && firstB == -1){
                firstB = i;
            }
            
        }

        return true  ; 
    }
}