class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) sum += mat[i][j];
                if (i == n - j - 1) sum += mat[i][j];
            }
        }
        if (n % 2 == 1) sum -= mat[n / 2][n / 2];
        return sum;
    }
}