class MyStack {

    Queue<Integer> q = new LinkedList<>();
    public MyStack() {}
    
    private void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return ;
        }

        int data = q.poll();
        reverse(q);
        q.add(data);

    }


    public void push(int x) {
        // reverse(q);
        q.add(x);
        // reverse(q);
    }
    
    public int pop() {
        reverse(q);
        int ans =  q.poll();
        reverse(q);
        return ans ;
    }
    
    public int top() {
        reverse(q);
        int ans =  q.peek();
        reverse(q);
        return ans ;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */