class Solution {

    private int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    public long intGcd(int[] arr) {

        int[] prfArr = new int[arr.length];

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            prfArr[i] = gcd(arr[i], max);
        }

        // System.out.println(Arrays.toString(prfArr));
        Arrays.sort(prfArr);

        int i = 0;
        int j = arr.length - 1;

        long sum = 0;

        while (i < j) {
            sum += gcd(prfArr[i], prfArr[j]);
            i++;
            j--;
        }

        return sum ; 

    }

    public long gcdSum(int[] nums) {
        return    intGcd(nums);
    }
}