class Solution {
    public List<List<String>> Nqueens(int currRowIdx, int[][] ansMat, int[] cols, List<List<String>> lists) {

        if (currRowIdx == ansMat.length) { // base Case

            //            System.out.println(Arrays.toString(ansMat));

            //            for(int[] arr : ansMat){
            //                System.out.println(Arrays.toString(arr));
            //            }

            List<String> res = new ArrayList<>();
            for (int i = 0; i < ansMat.length; i++) {
                StringBuilder sb = new StringBuilder();
                // sb.append('[');
                for (int j = 0; j < ansMat[i].length; j++) {
                    sb.append(ansMat[i][j] == 1 ? 'Q' : '.');
                }
                // sb.append(']');
                res.add(sb.toString());
            }

            //            System.out.println(res);

            lists.add(res);

            //            System.out.println();
            //            System.out.println();

            return lists;
        }

        for (int i = 0; i < ansMat[currRowIdx].length; i++) {

            if (cols[i] == -1) {
                continue;
            }

            // NorthEast me
            int a = currRowIdx;
            int b = i;
            boolean cond = false;

            while (a >= 0 && b >= 0) {

                if (ansMat[a][b] == 1) {
                    cond = true;
                    break;
                }

                a--;
                b--;
            }

            if (cond) {
                continue;
            }

            a = currRowIdx;
            b = i;
            cond = false;
            // NorthWest

            while (a >= 0 && b < ansMat.length) {

                if (ansMat[a][b] == 1) {
                    cond = true;
                    break;
                }

                a--;
                b++;
            }

            if (cond) {
                continue;
            }

            ansMat[currRowIdx][i] = 1;
            //            rows[i] = -1;
            cols[i] = -1;

            Nqueens(currRowIdx + 1, ansMat, cols, lists);

            ansMat[currRowIdx][i] = 0;
            //            rows[i] = 0;
            cols[i] = 0;
        }

        return lists;

    }
    public int totalNQueens(int n) {
        int[][] ansMat = new int[n][n];
        int[] cols = new int[n];

        return Nqueens(0, ansMat, cols, new ArrayList<>()).size() ;
    }
}
