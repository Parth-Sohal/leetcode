class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offer(x);
    }

    public void reverseQueue(Queue<Integer> q){

        if(q == null || q.isEmpty()){
            return ;
        }

        int data = q.poll();
        reverseQueue(q);
        q.add(data);

    }
    
    public int pop() {
        if(q.isEmpty()) return -1;

        reverseQueue(q);
        int data = q.poll();
        reverseQueue(q);
        return data;

    }
    
    public int top() {
        if(q.isEmpty()) return -1;

        reverseQueue(q);
        int data = q.peek();
        reverseQueue(q);
        return data;
        
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