class Solution {
    public int strStr(String haystack, String needle) {
        int idx = -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i < len1 - len2 + 1; i++) {
            if (haystack.substring(i, i + len2).equals(needle)) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}