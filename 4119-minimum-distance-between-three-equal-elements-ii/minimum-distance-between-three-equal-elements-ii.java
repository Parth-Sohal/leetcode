class Solution {
    public int minimumDistance(int[] arr) {
         HashMap<Integer, ArrayList<Integer>> mpp = new HashMap<>();

        for (int idx = 0; idx < arr.length; idx++) {

            if (mpp.containsKey(arr[idx])) {
                mpp.get(arr[idx]).add(idx);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(idx);
                mpp.put(arr[idx], list);
            }

        }

        // System.out.println(mpp);

        int minDist = Integer.MAX_VALUE;

        for (Integer key : mpp.keySet()) {

            if (mpp.get(key).size() >= 3) {
                ArrayList<Integer> indices = mpp.get(key);
                if (indices.size() >= 3) {
                    for (int idx = 0; idx <= indices.size() - 3; idx++) {
                        int i = indices.get(idx);
                        int k = indices.get(idx + 2); // The third element in this triplet

                        int dist = 2 * (k - i);
                        minDist = Math.min(minDist, dist);
                    }
                }
            }

        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}