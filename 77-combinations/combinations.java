class Solution {

    public List<List<Integer>> combinantion(List<Integer> list, int i, int k, int n, List<List<Integer>> lists) {

        if (list.size() == k) {
            // System.out.println(list);
            lists.add(new ArrayList<>(list));
            return lists;
        }

        for (int j = i; j <= n; j++) {

            list.add(j);
            combinantion(list, j + 1, k, n, lists);
            list.remove(list.size() - 1);
        }

        return lists;

    }

    public List<List<Integer>> combine(int n, int k) {
        return combinantion(new ArrayList<>(), 1,k, n, new ArrayList<>()) ;
    }
}