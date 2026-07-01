class Solution {

    private static boolean isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')return true ;

        return false ; 
    }

    public long countVowels(String word) {

        long ans = 0 ; 
        int n = word.length() ;

        for(int i = 0; i < word.length() ; i++){

            char ch = word.charAt(i) ;

            if(isvowel(ch)){
                ans += (long)(i+1) * (n - i);
            }

        }

        return ans ; 
        
    }
}