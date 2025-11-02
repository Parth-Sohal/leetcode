class Solution {
    public int minAddToMakeValid(String s) {
        int closeDept = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                closeDept++;
            }

            else {
                if (closeDept != 0) {
                    closeDept--;
                } else {
                    open++;
                }
            }
        }


        return (open + closeDept);
    }
}

