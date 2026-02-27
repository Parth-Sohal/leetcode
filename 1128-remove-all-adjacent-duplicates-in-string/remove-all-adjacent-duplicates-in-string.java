class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();


        for(int i = s.length() - 1 ; i >= 0 ; i--){

            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }

        }
        
        StringBuilder sb = new StringBuilder("") ;

        while(!st.isEmpty()){
            sb.append(st.pop());
        }


        return sb.toString();


    }
}