class Solution {

    public static void printSequence(int start, int end, List<Integer> arr) {

        for (int i = 1; i < 9; i++) {

            int ans = i;

            for (int j = i + 1; j <= 9; j++) {

                ans = (ans * 10) + j;

                if (ans >= start && ans <= end) {
                    arr.add(ans);
                }

            }

        }

    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr = new ArrayList<>();

        printSequence(low, high, arr);

        Collections.sort(arr);

        return arr  ; 
    }
}