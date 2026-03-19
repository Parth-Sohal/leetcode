class Solution {

    public int reverse(int n){

        int rev = 0 ;

        while(n!=0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }


        return rev;

    }

    public int countNicePairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        int mod = 1000000007;

        for (int i : nums) {

            int a = (i - reverse(i));


            if (map.containsKey(a)) {
                count = (count + (map.get(a))) % mod;
            }

            map.put(a, map.getOrDefault(a, 0) + 1);

        }

        return (int)count; 
    }
}