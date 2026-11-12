class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>() ;

        for(int i : asteroids){

            if( i >= 0 ){
                st.push(i);
            }

            else{
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(i) > st.peek() ){
                    st.pop();
                }

                if(!st.isEmpty() && Math.abs(i) == st.peek()){
                    st.pop();
                    continue;
                }

                if (st.isEmpty() || st.peek() < 0 || st.peek() < Math.abs(i)) {
                    st.push(i);
                }

            }

        }


        int[] ans = new int[st.size()];

        for(int i = ans.length-1; i>=0 ; i--){
            ans[i] = st.pop();
        }


        return ans;

 
    }
}