class Solution {
    public void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (j <= i) {
                    int temp = grid[i][j];
                    grid[i][j] = grid[j][i];
                    grid[j][i] = temp;
                }

            }
        }

        for (int[] arr : grid) {
            reverseArray(arr);
        }

    }
}