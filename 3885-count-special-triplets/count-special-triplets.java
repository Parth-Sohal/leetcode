class Solution {
    public int specialTriplets(int[] nums) {

        HashMap<Integer, Integer> mapRight = new HashMap<>();
        HashMap<Integer, Integer> mapLeft = new HashMap<>();
        int mod = 1000000007;

        for (int i : nums) {
            mapRight.put(i, mapRight.getOrDefault(i, 0) + 1);
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int element = nums[i];

            if (mapRight.containsKey(element)) {

                if (mapRight.getOrDefault(element, 0) > 1) {
                    mapRight.put(element, mapRight.getOrDefault(element, 0) - 1);
                } else {
                    mapRight.remove(element);
                }
            }

            if (mapLeft.containsKey(element * 2) && mapRight.containsKey(element * 2)) {
                long add = (long) mapLeft.get(element * 2) * mapRight.get(element * 2);
                count = (int) ((count + add) % mod);
            }

            mapLeft.put(element, mapLeft.getOrDefault(element, 0) + 1);

            // System.out.println(mapLeft + " " + mapRight + " " + count);

        }
        return count;
    }
}