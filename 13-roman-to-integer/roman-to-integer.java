class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        mpp.put('I', 1);
        mpp.put('V', 5);
        mpp.put('X', 10);
        mpp.put('L', 50);
        mpp.put('C', 100);
        mpp.put('D', 500);
        mpp.put('M', 1000);

        int num = 0;
        int l = s.length();

        num += mpp.get(s.charAt(l - 1));
        System.out.println(num);
        for (int i = l - 2; i >= 0; i--) {

            int val = mpp.get(s.charAt(i));
            int val2 = mpp.get(s.charAt(i + 1));

            if (val >= val2) {
                num += val;
            }

            else {
                num -= val;
            }

          
        }

        return num ; 
    }
}