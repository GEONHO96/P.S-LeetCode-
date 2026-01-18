class Solution {
    public boolean isPalindrome(String s) {
        boolean satisfied = true;
        StringBuilder sb = new StringBuilder();
        int length1 = s.length();
        for (int i = 0; i < length1; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append(Character.toLowerCase((s.charAt(i))));
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            if (sb.charAt(i) != sb.charAt(length2 - 1 - i)) {
                satisfied = false;
                break;
            }
        }
        return satisfied;
    }
}