class Solution {
    public String toLowerCase(String s) {
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                word += s.charAt(i);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                word += (char)(s.charAt(i) - 'A' + 'a');
            } else {
                word += s.charAt(i);
            }
        }
        return word;
    }
}