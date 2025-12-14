class MyQueue {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MyQueue() {}


    private void helper(Stack<Integer> s1 , Stack<Integer> s2){

        while(!s1.isEmpty()){
            s2.add(s1.pop());
        }

    }

    
    public void push(int x) {
        st1.add(x);
    }
    
    public int pop() {
        helper(st1,st2);
        int data =  st2.pop();
        helper(st2,st1);
        return data;
    }
    
    public int peek() {
        helper(st1,st2);
        int data =  st2.peek();
        helper(st2,st1);
        return data;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */