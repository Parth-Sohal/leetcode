class Solution {
    public int happy(int n, int sum) {
        if (n == 0) {
            return sum;
        }

        int m = n % 10;
        sum += (m * m);

        return happy(n / 10, sum);

    }

    public boolean isHappy(int n) {

        if (n == 1)
            return true;

        HashSet<Integer> set = new HashSet<>();

        while (true) {

            int ans = happy(n, 0);
            //            System.out.println(ans);

            if (ans == 1) {
                return true;
            }

            //            System.out.println(set);

            if (set.contains(ans)) {
                return false;
            }

            set.add(ans);
            n = ans;

        }

    }
}