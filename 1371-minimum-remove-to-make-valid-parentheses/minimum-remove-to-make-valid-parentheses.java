class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            }

            else if (ch == ')') {
                if (stack.isEmpty()) {
                    arr[i] = -1;
                }

                else {
                    stack.pop();
                }
            }

        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }



        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                continue;
            } else {
                sb.append(s.charAt(i));
            }

        }

        return sb.toString();
    }
}