class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1 ;
        int carry = 0 ;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 && j >= 0){

            int countOne = 0 ;

            if(a.charAt(i) == '1')countOne++;
            if(b.charAt(j) == '1')countOne++;
            if(carry == 1)countOne++;

            if(countOne % 2 != 0){
                sb.append('1');
            }

            else{
                sb.append('0');
            }


            carry = ((countOne >= 2) ? 1 : 0) ;

            i--;
            j--;
        }

        while(i >= 0){

            int countOne = 0 ;
            if(a.charAt(i) == '1')countOne++;

            if(carry == 1)countOne++;

            if(countOne % 2 != 0){
                sb.append('1');
            }

            else{
                sb.append('0');
            }


            carry = ((countOne >= 2) ? 1 : 0) ;
            i--;

        }

        while(j >= 0){

            int countOne = 0 ;
            if(b.charAt(j) == '1')countOne++;

            if(carry == 1)countOne++;

            if(countOne % 2 != 0){
                sb.append('1');
            }

            else{
                sb.append('0');
            }


            carry = ((countOne >= 2) ? 1 : 0) ;

            j--;

        }


        if(carry == 1)sb.append(1);

        return sb.reverse().toString();


    }
}