class Solution { // contribution 


    // a b a

    public boolean vowels(char c){
        if(c == 'a' ||  c == 'e' ||  c == 'i' || c == 'o' || c == 'u')return true ;
        return false ; 
    }

    public long countVowels(String word) {
        
        long ans = 0 ;  
        int n = word.length();

        for(int i = 0 ; i < n ;i++){
            char ch = word.charAt(i);
            if(vowels(ch)){
                ans += ((long)(i + 1) * (n - i));
            }

        } 


        return ans ; 


    }
}