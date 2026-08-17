class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int total = 0;

        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {

            int a = boxTypes[i][0];
            int b = boxTypes[i][1];

            if (a > truckSize) {
                total += (truckSize * b);
                break;
                //                truckSize = 0;
            } else {
                total += (a * b);
                truckSize -= a;
            }

        }

        return total ; 
    }
}