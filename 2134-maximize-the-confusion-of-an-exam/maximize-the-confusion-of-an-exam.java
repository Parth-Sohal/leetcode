class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int n = answerKey.length() ;
        int max = 0 ; 
        int start = 0 ;

        int Tcount = 0 ; 
        int Fcount = 0 ; 

        for(int i = 0 ; i < n ; i++){

            char ch = answerKey.charAt(i); 

            if(ch == 'T')Tcount++;
            else Fcount++; 

            while((i-start+1) - Math.max(Tcount,Fcount) > k){

                char c = answerKey.charAt(start++);

                if(c == 'T')Tcount--;
                else Fcount--; 

            }

            max = Math.max(max , i - start + 1);

        }

        return max ; 



        
    }
}