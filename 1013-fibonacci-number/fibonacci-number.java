class Solution {
    public int fibbo(int n , HashMap<Integer,Integer> map){

        if( n <=  1){
            return n;
        }
        // System.out.println(map);

        if(map.containsKey(n)){
            return map.get(n);
        }

        else{
            int ans = fibbo(n-1,map) + fibbo(n-2,map);
            map.put(n,ans);
            return ans;
        }

    }
    public int fib(int n) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        return fibbo(n , map);
    }
}