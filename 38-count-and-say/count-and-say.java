class Solution {
    public String countAndSay(int n) {

        StringBuilder s = new StringBuilder();

        s.append("1");

        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();

            int j = 0;
            int count = 0;
            char c = s.charAt(0);

            while (j < s.length()) {

                if (s.charAt(j) == c) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(c);
                    count = 1;
                    c = s.charAt(j);
                }
                j++;

            }
            temp.append(count);
            temp.append(c);
            // System.out.println(temp);

            s = temp;

        }

        return s.toString() ;
    }
}