class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = mat[0].length - 1;

        int top = 0;
        int btm = mat.length - 1;

        while (left <= right && top <= btm) {

            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }

            top++;

            for (int i = top; i <= btm; i++) {
                list.add(mat[i][right]);
            }

            right--;

            if (top <= btm) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[btm][i]);
                }

                btm--;
            }

            if (left <= right) {
                for (int i = btm; i >= top; i--) {
                    list.add(mat[i][left]);
                }

                left++;
            }

        }

        return list ;
    }
}