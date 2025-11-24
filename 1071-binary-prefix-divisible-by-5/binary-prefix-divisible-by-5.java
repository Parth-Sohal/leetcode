class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        long n = 0;
        int i = 0;
        List<Boolean> list = new ArrayList<Boolean>();

        while (i < nums.length) {
            n = ((n << 1) + nums[i]) % 5;
            list.add(n == 0);
            i++;
        }

        return list;
    }
}