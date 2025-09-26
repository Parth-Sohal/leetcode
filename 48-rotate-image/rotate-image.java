class Solution {

    private void rotateArrays(int[] arr){

        int l = arr.length ;

        int i = 0 ;
        int j = l - 1 ;

        while( i < j ){
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;

            i++;
            j--;
        }

    }


    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j < i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            //            rotateArrays(matrix[i]);
        }

        for (int i = 0; i < row; i++) {
            rotateArrays(matrix[i]);
        }


    }
}