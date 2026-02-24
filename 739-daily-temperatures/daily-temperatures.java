class Solution {

    private class TempratureStore{

        int temp ;
        int idx ;

        TempratureStore(int temp , int idx){
            this.temp = temp ;
            this.idx = idx ;
        }

    }


    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<TempratureStore> st = new Stack<>();

        for(int i = temperatures.length-1 ; i>=0 ; i--){

            int temp = temperatures[i];

            while(!st.isEmpty() && temp >= st.peek().temp){
                st.pop();
            }

            if(st.isEmpty()){
                temperatures[i]  = 0;
            }else{
                temperatures[i] = st.peek().idx - i ;
            }


            st.push(new TempratureStore(temp , i));

        }

        return temperatures ;


    }
}