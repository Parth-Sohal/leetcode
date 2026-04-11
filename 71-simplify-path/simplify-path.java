class Solution {
    public String simplifyPath(String path) {
        
        Stack<StringBuilder> stack = new Stack<>();

        int i = 0;

        while (i < path.length()) {

            char ch = path.charAt(i);

            if (ch == '/') {
                i++;
            }

            else {
                StringBuilder sb = new StringBuilder();
                //                sb.append(ch);

                while (i < path.length() && path.charAt(i) != '/') {
                    sb.append(path.charAt(i));
                    i++;
                }

                if (sb.toString().equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }

                else if (sb.toString().equals(".")) {
                    continue;
                }

                else {
                    stack.push(sb);
                }

            }

            //            System.out.println(stack);
        }

        Stack<StringBuilder> st2 = new Stack<>();

        while (!stack.isEmpty()) {
            st2.push(stack.pop());
        }

        // System.out.println(st2);

        StringBuilder ans = new StringBuilder("/");

        while (st2.size() > 1) {
            ans.append(st2.pop() + "/");
        }

        if(!st2.isEmpty()){
            ans.append(st2.pop());
        }

        return ans.toString(); 

    }
}