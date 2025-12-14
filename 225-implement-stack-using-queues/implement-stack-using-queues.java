class MyStack {

    Queue<Integer> q = new LinkedList<>();
    public MyStack() {}
    
    


    public void push(int x) {
        
        int size = q.size();
        q.add(x);
        for(int i = 1 ; i <= size ; i++){
            q.add(q.poll());
        }

    }
    
    public int pop() {
        // reverse(q);
        int ans =  q.poll();
        // reverse(q);
        return ans ;
    }
    
    public int top() {
        // reverse(q);
        int ans =  q.peek();
        // reverse(q);
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