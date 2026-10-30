class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));

        // System.out.println(Arrays.deepToString(boxTypes));

        int i = boxTypes.length - 1;

        int ans = 0;

        while (i >= 0 && truckSize > 0) {

            int boxes = boxTypes[i][0];
            int units = boxTypes[i][1];

            if (boxes >= truckSize) {
                boxes = truckSize;
                truckSize = 0;
            } else {
                truckSize -= boxes;
            }

            ans += (boxes * units);

            //            System.out.println(boxes + " " +ans +" " + truckSize);
            i--;

        }

        return ans ; 
    }
}