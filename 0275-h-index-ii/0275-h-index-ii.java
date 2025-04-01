import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                index++;
            }
        }
        return index;
    }
}