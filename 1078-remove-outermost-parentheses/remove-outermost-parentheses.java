class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Integer> st = new Stack<>();

        int[] arr = new int[s.length()];

        for(int i = 0 ; i < s.length() ;i++){

            char ch = s.charAt(i) ;

            if(ch == '('){
                st.push(i);
            }


            else {

                if(st.size() == 1){
                    arr[st.peek()] = -1;
                    arr[i] = -1;
                }

                st.pop();

            }

        }
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){

            if(arr[i] != -1){
                sb.append(s.charAt(i));
            }

        }

        return sb.toString() ;

    }
}