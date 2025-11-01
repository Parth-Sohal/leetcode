class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address.length());

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                sb.append(address.charAt(i));
            } else {
                sb.append("[.]");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}