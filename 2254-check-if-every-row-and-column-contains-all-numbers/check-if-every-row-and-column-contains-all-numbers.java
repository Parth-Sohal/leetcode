class Solution {
    public boolean checkValid(int[][] matrix) {

        int n  = matrix.length ; 

        
        for(int i = 0 ; i < n ; i++){

            int[] arr = new int[n+1];

            for(int j = 0 ; j < n ; j++){

                int val = matrix[i][j] ;

                if(val > n || val < 1 || arr[val] == 1){
                    return false; 
                }

                arr[val] = 1;

            }

        }

        for(int i = 0 ; i < n ; i++){

            int[] arr = new int[n+1];

            for(int j = 0 ; j < n ; j++){

                int val = matrix[j][i] ;

                if(val > n || val < 1 || arr[val] == 1){
                    return false; 
                }

                arr[val] = 1;

            }

        }
        

        return true ; 


    }
}