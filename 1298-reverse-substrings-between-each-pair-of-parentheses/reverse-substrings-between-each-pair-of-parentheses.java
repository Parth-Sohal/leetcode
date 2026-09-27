class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == ')') {

                StringBuilder temp = new StringBuilder();
                while (!stack.peek().equals("(")) {

                    temp.append(stack.pop());

                }
                stack.pop();

                stack.push(temp.reverse().toString());

            } else {
                stack.push(s.charAt(i) + "");
            }
            i++;
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        ans.reverse();
        return ans.toString(); 
    }
}