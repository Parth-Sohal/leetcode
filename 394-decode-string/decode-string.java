class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;

        while (i < s.length()) {

            Character ch = s.charAt(i);

            if (ch == ']') {

                StringBuilder sb = new StringBuilder("");

                while (!st.peek().equals("[")) {
                    sb.insert(0, st.pop());
                }

                st.pop();

                int n = Integer.parseInt(st.pop());

                //                sb.reverse() ;

                System.out.println(sb.toString() + " " + n);

                sb.repeat(sb, n - 1);

                System.out.println(sb.toString() + " " + n);

                st.push(sb.toString());

            }

            else {

                if (ch >= '0' && ch <= '9') {

                    StringBuilder sb = new StringBuilder("");

                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        sb.append(s.charAt(i));
                        i++;
                    }

                    st.push(sb.toString());
                    i--;

                }

                else {
                    st.push(ch.toString());
                }
            }

            i++;

        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }

        return sb.toString();
    }
}