class Solution {
    public boolean checkIfExist(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {

            int ans = arr[i] * 2;

            if (map.containsKey(ans) && map.get(ans) != i) {
                return true;
            }

        }
        return false;

    }
}