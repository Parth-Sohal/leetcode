class Solution {
    public int minDeletions(String s) {
        int ans = 0;

        Integer[] countArr = new Integer[26];
        Arrays.fill(countArr, 0);

        for (char ch : s.toCharArray()) {
            countArr[ch - 'a']++;
        }

        Arrays.sort(countArr , Collections.reverseOrder());

        // System.out.println(Arrays.toString(countArr));

        HashSet<Integer> set = new HashSet<>();

        for (int i : countArr) {

            if (i == 0)
                break;

            if (set.contains(i)) {

                int n = i;

                while (n > 0 && set.contains(n)) {
                    n = n - 1;
                    ans++;
                }

                if (n != 0)
                    set.add(n);

            } else {
                set.add(i);
            }

        }

        return ans ; 
    }
}