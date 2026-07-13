class Solution {

    public static void printSequence(int idx, int ans, int start, int end, List<Integer> list) {

        if (ans > end) {
            return;
        }

        if (ans >= start) {
            // System.out.println(ans);
            list.add(ans);
            //            return;
        }

        if (idx == 10) {
            return;
        }

        if (idx == 1) {
            for (int i = 1; i <= 9; i++) {
                printSequence(i + 1, i, start, end, list);
            }
        } else {
            printSequence(idx + 1, (ans * 10 + idx), start, end, list);
        }

    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        printSequence(1, 0, low, high , list);
        Collections.sort(list);
        return list ; 
    }
}