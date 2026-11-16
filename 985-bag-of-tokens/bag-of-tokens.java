class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        if(tokens.length == 0){
            return 0 ; 
        }
        
        int count = 0 ; 
        Arrays.sort(tokens);

        int i = 0 ;  // small 
        int j = tokens.length - 1;  // large


        while(i < j){

            if(tokens[i] <= power){
                power -= tokens[i];
                count++ ;
                i++;
            }


            else{

                if(count == 0)
                {
                    return 0 ;
                }             

                else{
                    power += tokens[j];
                    count--;
                }
                
                j--;
            }
            
        }

        if(i == j){
            if(tokens[i] <= power)count++; 
        }


        return count ; 
        
    }
}