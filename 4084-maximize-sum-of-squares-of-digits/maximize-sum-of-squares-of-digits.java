class Solution {
    public String maxSumOfSquares(int n, int num) {
        
        StringBuilder sb = new StringBuilder() ;

        while(num > 0  && sb.length()<n){

            if(num >= 10){
                num -= 9 ;
                sb.append("9") ;
            }

            else{
                sb.append(num) ;
                num = 0 ;
            }

        }
        
        if(sb.length()>=n && num > 0){
            return "";
        }

         while(sb.length()<n){
            sb.append("0");
        }

        return sb.toString();

    }

}