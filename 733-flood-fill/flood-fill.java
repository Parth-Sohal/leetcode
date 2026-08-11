class Solution {
    public static void floodfill(
            int[][] matrix,
            int[][] directions,
            int xIdx, int yIdx,
            int color) {

        int originalColour = matrix[xIdx][yIdx];

        if (originalColour == color) {
            return;
        }

        matrix[xIdx][yIdx] = color; // visited

        for (int[] mat : directions) {
            int newXIdx = xIdx + mat[0];
            int newYIdx = yIdx + mat[1];

            if ((newXIdx >= 0 && newXIdx < matrix.length) && (newYIdx >= 0 && newYIdx < matrix[0].length) &&
                    matrix[newXIdx][newYIdx] == originalColour) {
                floodfill(matrix, directions, newXIdx, newYIdx, color);
            }

        }

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        floodfill(image , directions ,  sr , sc , color ); 
        return image ; 
    }
}