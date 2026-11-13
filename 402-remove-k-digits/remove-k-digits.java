class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            int n = num.charAt(i) - '0';

            while (!st.isEmpty() && k > 0 && n < st.peek()) {
                st.pop();
                k--;
            }

            st.push(n);

        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }

        String result = sb.substring(start);
        return result.length() == 0 ? "0" : result;
    }
}