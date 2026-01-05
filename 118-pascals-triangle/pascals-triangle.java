class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows ; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int cur = 1;

            for (int j = 0; j <= i; j++) {

                temp.add(cur);
                cur = cur * (i - j) / (j + 1);

            }

            list.add(temp);

        }

        return list;

    }
}