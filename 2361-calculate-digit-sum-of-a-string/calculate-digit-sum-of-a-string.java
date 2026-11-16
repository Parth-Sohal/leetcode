class Solution {


    
    

    public String digi(String s , int k){

        int i = 0 , n = s.length(); 
        StringBuilder sb = new StringBuilder();

        while(i < n ) {

            int lastIdx = Math.min(n , i + k);
            
            int num = 0 ; 

            for(int j = i ; j < lastIdx ; j++){
                num += s.charAt(j)- '0';
            }

            sb.append(num);
            i += k ; 

        }

        return sb.toString();


    } 

    public String digitSum(String s, int k) {
        while(s.length() >  k){
            s = digi(s,k);
        }

        return s ; 
    }
}