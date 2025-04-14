import java.util.Arrays;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int[] secondHeights = new int[n];
        int[] thirdHeights = new int[n];
        for (int i = 0; i < n; i++) {
            secondHeights[i] = heights[i];
        }
        String[] newNames = new String[n];
        Arrays.sort(secondHeights);
        for (int i = n - 1; i >= 0; i--) {
            thirdHeights[i] = secondHeights[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (heights[i] == thirdHeights[j]) {
                    newNames[j] = names[i];
                }
            }
        }
        return newNames;
    }
}