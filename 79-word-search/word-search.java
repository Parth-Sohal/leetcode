class Solution {

    public  boolean[] wordSearch(int[][] aux , int i , int j , int strIdx ,  int row , int col ,  char[][] arr , String s  , boolean[] ans) {


        if(aux[i][j] == -1 || arr[i][j] != s.charAt(strIdx)) {
            return ans ;
        }
        

        if(strIdx == s.length() - 1) {
            ans[0] = true ;
            return ans ;
        }

        


        // up

        if(!ans[0]){
            if( i - 1 >= 0){
                aux[i][j] = -1;
                wordSearch(aux , i-1 , j , strIdx+1 , row , col , arr , s,  ans) ;
                aux[i][j] = 0;
            }
        }


        // down

        if(!ans[0]){
            if( i+1 <= row){
                aux[i][j] = -1;
                wordSearch(aux , i+1 , j , strIdx+1 , row , col , arr , s,  ans) ;
                aux[i][j] = 0;
            }
        }



        // left

        if(!ans[0]){
            if( j-1 >= 0){
                aux[i][j] = -1;
                wordSearch(aux , i , j-1 , strIdx+1 , row , col , arr , s,  ans) ;
                aux[i][j] = 0;
            }
        }


        // right
        if(!ans[0]){
            if( j+1 <= col){
                aux[i][j] = -1;
                wordSearch(aux , i , j+1 , strIdx+1 , row , col , arr , s,  ans) ;
                aux[i][j] = 0;
            }
        }


        return ans ;

    }

    public  boolean helper(char[][] mat, String s) {

        int[][] aux = new int[mat.length][mat[0].length];
        boolean[] a = new boolean[1];
        a[0] = false ;
        boolean vr  = false ;

        boolean ans = false ;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == s.charAt(0)) {

                    boolean[] b = wordSearch(aux , i , j , 0 , mat.length-1 , mat[0].length-1 , mat , s, a );
                   if(b[0]){
                        vr = true ;
                        break;
                   }
                }
            }
        }

        return vr;
    }

    public boolean exist(char[][] board, String word) {
        return helper(board  , word);
    }
}