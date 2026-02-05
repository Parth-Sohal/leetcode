class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        while ((start > 0) || (goal > 0)) {

            // System.out.println(start + " " + goal);

            int a = start & 1;
            int b = goal & 1;

            if ((a ^ b) == 1) {
                // System.out.println("a ->" + a + " : b-> " + b);
                count++;
            }

            start = start >> 1;
            goal = goal >> 1;
        }
        return count ; 
    }
}