class Solution {

    private void helper(String digits, HashMap<Character, String> map,
            int idx, String ans, List<String> list) {

        if (idx >= digits.length()) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < map.get(digits.charAt(idx)).length(); i++) {
            helper(digits, map, idx + 1, ans + map.get(digits.charAt(idx)).charAt(i), list);
        }

    }

    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> mpp = new HashMap<>();

        mpp.put('2', "abc");
        mpp.put('3', "def");
        mpp.put('4', "ghi");
        mpp.put('5', "jkl");
        mpp.put('6', "mno");
        mpp.put('7', "pqrs");
        mpp.put('8', "tuv");
        mpp.put('9', "wxyz");

        ArrayList<String> list = new ArrayList<String>();
        helper(digits, mpp, 0, "", list);

        return list ; 
    }
}