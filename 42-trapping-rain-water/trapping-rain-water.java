class Solution {
    public int trap(int[] arr) {

        int[] leftMaxArr = new int[arr.length];
        int[] rightMaxArr = new int[arr.length];

        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            leftMax = Math.max(leftMax, arr[i]);
            rightMax = Math.max(rightMax, arr[arr.length - 1 - i]);

            leftMaxArr[i] = leftMax;
            rightMaxArr[arr.length-1-i] = rightMax;
        }

        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(leftMaxArr));
        // System.out.println(Arrays.toString(rightMaxArr));

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count += ((Math.min(leftMaxArr[i], rightMaxArr[i])) - arr[i]);
        }

        return count ; 

    }
}