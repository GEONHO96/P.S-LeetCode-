class Solution {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int[] ans = new int[len + 1];
        for (int i = 0; i < len + 1; i++) {
            if (i == 0) ans[i] = 0;
            else ans[i] = ans[i - 1] + gain[i - 1];
        }
        int max = -100;
        for (int i = 0; i < len + 1; i++) {
            max = Math.max(max, ans[i]);
        }
        return max;
    }
}