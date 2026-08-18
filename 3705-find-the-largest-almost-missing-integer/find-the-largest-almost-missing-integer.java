class Solution {
    public int largestInteger(int[] arr, int k) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // k = 1
        if (k == 1) {

            int ans = -1;

            for (Integer key : map.keySet()) {
                if (map.get(key) == 1) {
                    ans = Math.max(ans, key);
                }
            }

            return ans;
        }

        // k = n
        else if (k == n) {

            int max = Arrays.stream(arr).max().getAsInt();

            return max;
        }

        // 1 < k < n
        else {

            int first = arr[0];
            int last = arr[n - 1];

            int ans = -1;

            if (map.get(first) == 1) {
                ans = first;
            }

            if (map.get(last) == 1) {
                ans = Math.max(ans, last);
            }

            return ans;
        }
    }
}