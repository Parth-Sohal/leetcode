class Solution {

    private int reverse(int n){
        int rev =0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                // System.out.println(map.get(nums[i]));
                min = Math.min(min, Math.abs(i - map.get(nums[i])));
            }

            map.put(reverse(nums[i]), i);

        }


        return min == Integer.MAX_VALUE  ? -1 : min ; 
    }
}