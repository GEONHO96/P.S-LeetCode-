class Solution {
    public String reversePrefix(String s, int k) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < k) {
                sb.append(s.charAt(k - 1 - i));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}