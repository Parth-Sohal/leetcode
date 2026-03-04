class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int n = nums.length;

        for(int i = (2*n - 1) ; i >=0 ; i--){

            int val = nums[i%n];

            while(!st.isEmpty() && val >= st.peek()){
                st.pop();
            }

            if(i < n){
                if(st.isEmpty()){nums[i] = -1;}
                else {nums[i] = st.peek();}
            }

            st.push(val);

        }

        return nums ; 
    }
}