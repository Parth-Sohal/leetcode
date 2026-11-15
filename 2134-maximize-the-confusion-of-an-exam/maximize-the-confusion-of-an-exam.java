class Solution {
    public int maxConsecutiveAnswers(String nums, int k) {
        
        int start = 0 ;

        int Tcount = 0 ; 
        int Fcount = 0 ; 

        int max = 0 ;


        for(int i  = 0 ;  i < nums.length() ; i++){

            if(nums.charAt(i) == 'T'){ Tcount++;}
            else{Fcount++;}


            while((i-start+1 - Math.max(Tcount ,Fcount)) > k){
                if(nums.charAt(start) == 'T'){
                    Tcount--;
                }else{
                    Fcount--;
                }

                start++;
            }


            max = Math.max(i - start + 1 , max);

        }


        return max ; 

    }
}