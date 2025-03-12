class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2 * len];
        for (int i = 0; i < 2 * len; i++) {
            if (0 <= i && i < len) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - len];
            }
        }
        return ans;
    }
}