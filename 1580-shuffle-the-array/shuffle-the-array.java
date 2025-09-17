class Solution {

    public int[] shuffle(int[] arr, int n) {
        int length = arr.length;
        int[] ans = new int[length];

        int i = 0;
        int j = 0;
        while (i < n) {

            // System.out.println(arr[i] + " " + arr[i + n]);
            ans[j] = arr[i];
            ans[++j] = arr[(i + n)];
            i++;
            j++;

        }

        return ans ; 
    }

}