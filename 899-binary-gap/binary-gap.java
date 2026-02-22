class Solution {
    public int binaryGap(int n) {

        int count = 0;
        int max = 0;
        int last = -1;

        while (n > 0) {

            int currDigi = (n & 1);

            if (currDigi == 1) {
                // System.out.println(count + " " + last);
                if (last != -1)
                    max = Math.max(max, count - last);
                last = count;
            }

            count++;
            n = n >> 1;

        }

        return max;

    }
}