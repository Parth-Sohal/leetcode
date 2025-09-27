class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;


        int[] rows = new int[row];
        int[] cols = new int[col];


        for(int i = 0; i < row; i++) {
            int min =  Integer.MAX_VALUE;
            for(int j = 0; j < col; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            rows[i] = min;
        }

        for(int i = 0; i < col; i++) {
            int max =  Integer.MIN_VALUE;
            for(int j = 0 ; j < row ; j++){
                if(arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
            cols[i] = max;
        }

        List<Integer> list = new ArrayList<>();


        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(arr[i][j] == rows[i] && arr[i][j] == cols[j]) {
                    list.add(arr[i][j]);
                }
            }
        }


        return list;
    }
}