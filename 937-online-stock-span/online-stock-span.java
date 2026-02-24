class StockSpanner {

    private class span2 {
        int data;
        int valueTillHere;

        span2(int data, int valueTillHere) {
            this.data = data;
            this.valueTillHere = valueTillHere;
        }

    }

    Stack<span2> st ; 

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {

        int data = price ;
        int val = 1 ;

        while(!st.isEmpty() && data >= st.peek().data){
            val += st.pop().valueTillHere ;
        }

        st.push(new span2(data , val));
        return val ;

    


    }   
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */