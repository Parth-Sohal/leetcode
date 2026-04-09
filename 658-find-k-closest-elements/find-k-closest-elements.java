class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int i = 0;
        int j = arr.length - 1;


        while ((j - i + 1) != k) {

            int a = Math.abs(x - arr[i]);
            int b = Math.abs(x - arr[j]);

            if (a > b) {
                i++;
            } else {
                j--;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int it = i; it <= j; it++) {
            list.add(arr[it]);
        }

        return list ; 

    }
}