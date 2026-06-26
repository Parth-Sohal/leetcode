class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int sum = Arrays.stream(cardPoints).sum();

        if (n == k) return sum;

        int l = n - k;

        int max = Integer.MAX_VALUE;
        int runSum = 0;
        int start = 0 ;

        for (int i = 0; i < n; i++) {

            runSum += cardPoints[i];

            if(i - start + 1 > l){
                runSum -= cardPoints[start++];
            }

            if((i - start + 1) == l){
                max = Math.min(runSum, max);
            }

        }

        return sum - max ; 

    }
}