class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) == ch) {
                k = i;
                break;
            }
        }
        for (int i = k; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        for (int i = k + 1; i < n; i++) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}