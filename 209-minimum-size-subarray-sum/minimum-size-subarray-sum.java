class Solution {
    public int minSubArrayLen(int k, int[] arr) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (j < arr.length) {

            sum += arr[j];

            while (sum >= k && i <= j) {
                min = Math.min(min, j - i + 1);
                sum -= arr[i];
                i++;
            }

        

            j++;

        }

        if(min == Integer.MAX_VALUE)return 0 ; 
        return min ; 

    }
}
