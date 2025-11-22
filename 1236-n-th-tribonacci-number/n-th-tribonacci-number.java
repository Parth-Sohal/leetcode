class Solution {
    public int fibbo(int n , HashMap<Integer,Integer> map){

        if( n <=  1){
            return n;
        }
        if( n == 2){
            return 1;
        }
        // System.out.println(map);

        if(map.containsKey(n)){
            return map.get(n);
        }

        else{
            int ans = fibbo(n-1,map) + fibbo(n-2,map) + fibbo(n-3,map);
            map.put(n,ans);
            return ans;
        }

    }
    public int tribonacci(int n) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        return fibbo(n,mpp);
    }
}