class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int ans = 0;
        while (n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        ans = product - sum;
        return ans;
    }
}