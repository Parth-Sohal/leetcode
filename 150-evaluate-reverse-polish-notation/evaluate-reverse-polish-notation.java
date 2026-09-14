class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {

                int second = st.pop();
                int first = st.pop();

                switch (s.charAt(0)) {

                    case '+':
                        st.push(first + second);
                        break;

                    case '-':
                        st.push(first - second);
                        break;

                    case '*':
                        st.push(first * second);
                        break;

                    case '/':
                        st.push(first / second);
                        break;
                }

            }

            else {
                st.push(Integer.parseInt(s));
            }

        }


        return st.pop();

    }
}