class MinStack {

    Stack<Min> st;

    private class Min {

        int data;
        int min;

        public Min(int data,int min) {
            this.data = data;
            this.min = min ;
        }

    }

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {

        if(st.isEmpty()){
            st.push(new Min(val , val));
        }

        else{
            st.push( new Min (val , Math.min (val ,  Math.min(val,st.peek().min)  ) ) ) ;
        }

    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().data;
    }

    public int getMin() {
        return st.peek().min;
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