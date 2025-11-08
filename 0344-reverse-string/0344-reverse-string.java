class Solution {
    public void reverseString(char[] s) {
        String sentence = new String(s);
        int length = s.length;
        for (int i = 0; i < length; i++) {
            s[i] = sentence.charAt(length - i - 1);
        }
    }
}