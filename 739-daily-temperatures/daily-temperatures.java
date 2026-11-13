class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n =  temperatures.length;
        int[] ans = new int[n];

        for(int i = n - 1 ; i >= 0 ; i--){

            int num = temperatures[i];

            while(!st.isEmpty()  && num >= temperatures[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] =  0 ;
            }

            else{
                ans[i] = st.peek() - i ;
            }
            
            st.push(i);
            
        }
        return ans ; 
    }
}