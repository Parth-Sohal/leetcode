class Solution {
    public static void generateParanthesis(int n, int left, int right, String temp, List<String> ans) {

        if (temp.length() == 2 * n) {
            ans.add(new String(temp));
            return ; 
        }

        if (left < n) {
            generateParanthesis(n, left + 1, right, temp + "(", ans);
        }
        if (right < left) {
            generateParanthesis(n, left, right + 1, temp + ")", ans);
        }

    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParanthesis(n, 0, 0, "", ans);
        return ans ; 
    }
}