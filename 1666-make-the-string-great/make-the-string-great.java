class Solution {
    public String makeGood(String s) {


        // small = big + 32 

        Stack<Character> st = new Stack<>() ;


        for(int i = 0 ; i < s.length() ; i++){


            char ch = s.charAt(i) ;

            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32 ){
                st.pop() ;
            }


            else{
                st.push(ch);
            }

        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }


        return sb.reverse().toString(); 
        
    }
}