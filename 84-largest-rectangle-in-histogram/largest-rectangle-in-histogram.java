class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = heights[0];
        int n = heights.length;

        for (int i = 0; i < heights.length; i++) {// monotonic

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {

                int ele = st.pop();

                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                max = Math.max(max, width * heights[ele]);

            }

            st.push(i);
        }

        while (!st.isEmpty()) {

            int ele = st.pop();

            int width;

            if (st.isEmpty()) {
                width = n;
            } else {
                width = n - st.peek() - 1;
            }

            max = Math.max(max, width * heights[ele]);

        }

        return max;
    }
}