class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> set = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {

                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);

                    // System.out.println(list);

                    j++;
                    k--;

                    while(j < k && arr[j] == arr[j-1])j++;
                    while(j < k && arr[k] == arr[k+1])k--;

                    set.add(list);

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }

            }

        }
        // System.out.println(set);
        return set ; 
    }
}