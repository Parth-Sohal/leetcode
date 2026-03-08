class Solution {

    public String ansMake(String str, int n, String ans, HashSet<String> hs) {

        if (str.length() == n) {

            if (!hs.contains(str)) {
                ans = str;
            }

            return ans;

        }

        ans = ansMake(str + '0', n, ans, hs);

        if (ans.equals("")) {
            ans = ansMake(str + '1', n, ans, hs);
        }

        return ans;

    }

    public String findDifferentBinaryString(String[] nums) {

        // simple hai lets do it

        int n = nums.length;

        HashSet<String> hs = new HashSet<>();

        for(String s : nums){
            hs.add(s);
        }


        return ansMake("", n,"" , hs);


    }
}