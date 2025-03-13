class Solution {
    public String defangIPaddr(String address) {
        int len = address.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (address.charAt(i) == '.') sb.append("[.]");
            else sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}