class MinStack {

    Stack<int[]> stack;
    int currMin;

    public MinStack() {
        stack = new Stack<>();
        currMin = Integer.MAX_VALUE;
    }

    public void push(int val) {

        currMin = Math.min(currMin, val);

        stack.push(new int[] { val, (int) currMin });

    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop() ;
        }

        if(stack.isEmpty())currMin = Integer.MAX_VALUE ;
        else currMin = stack.peek()[1];
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return  stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */