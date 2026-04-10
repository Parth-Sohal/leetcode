class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i : arr) {

            if (i >= 0) {
                st.push(i);
            }

            else {

                // last neg or empty direct push

                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(i)) {
                    st.pop();
                }

                if (!st.isEmpty() && st.peek() == Math.abs(i)) {
                    st.pop();
                    continue;
                }

            
                if (st.isEmpty() || st.peek() < 0 || st.peek() < Math.abs(i)) {
                    st.push(i);
                } 

            }
            // System.out.println(st);

        }

return st.stream().mapToInt(Integer::intValue).toArray();
        
    }
}