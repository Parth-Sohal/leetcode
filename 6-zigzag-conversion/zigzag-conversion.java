class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1)return s ;

        int n = s.length() ;

        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder() ;
        }
        System.out.println(sbs.length);

        int crrRow = 0 ;
        int dir = 1 ; //down
        int idx = 0 ;

        while(idx < n){

            char c = s.charAt(idx++) ;
            sbs[crrRow].append(c) ;



            if(dir == 1){

                if(crrRow == numRows - 1){
                    dir = -1 ;
                    crrRow--;
                }
                else{
                    crrRow++;
                }

            }

            else{

                if(crrRow == 0){
                    dir = 1 ;
                    crrRow++;
                }

                else{
                    crrRow--;
                }

            }

        }

        StringBuilder ans = new StringBuilder() ;


        for(StringBuilder stt : sbs){
            ans.append(stt) ;
        }


        return ans.toString(); 

    }
}