class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < s.length() ; i++){

            if(s.charAt(i) == '('){
                stack.push(i);
            }

            else{

                if(stack.size() == 1){
                    list.add(stack.peek());
                    list.add(i);
                }


                stack.pop();

            }


        }

        // System.out.println(list);
        int k = 0 ;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){

            if(k < list.size() && list.get(k) == i){
                k++;
            }

            else{
                sb.append(s.charAt(i));
            }


        }

        return sb.toString() ;

    }
}