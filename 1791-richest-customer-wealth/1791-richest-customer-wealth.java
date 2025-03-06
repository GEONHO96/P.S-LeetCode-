class Solution {
    public int maximumWealth(int[][] accounts) {
        int len1 = accounts.length;
        int max = 0;
        for (int i = 0; i < len1; i++) {
            int len2 = accounts[i].length;
            int sum = 0;
            for (int j = 0; j < len2; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}