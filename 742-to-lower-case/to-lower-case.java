class Solution {
    public String toLowerCase(String s) {
        StringBuilder builder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                builder.append((char) (s.charAt(i) - 'A' + 97));
            } else {
                builder.append(s.charAt(i));
            }
            //           System.out.println(s.charAt(i) + " " + ((char)(s.charAt(i) - 'A' + 97)));
        }

        return builder.toString();
    }
}