class Solution {
    public int countWays(int[][] ranges) {

        Arrays.sort(ranges, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 1 ;
        int start = ranges[0][0];
        int end = ranges[0][1];

        for(int i = 1 ; i < ranges.length ; i++){

            int currStart = ranges[i][0];

            if(currStart > end){
                start = currStart;
                end = ranges[i][1];
                count++;
            }
            else {
                end = Math.max(end, ranges[i][1]);
            }

        }

        long ans = 1;
        long mod = 1_000_000_007;
        for (int i = 0; i < count; i++) {
            ans = (ans * 2) % mod;
        }
        
        return (int) ans;

    }
}