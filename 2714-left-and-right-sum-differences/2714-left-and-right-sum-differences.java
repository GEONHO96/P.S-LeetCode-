class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) leftSum[i] = 0;
            else leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) rightSum[i] = 0;
            else rightSum[i] = nums[i + 1] + rightSum[i + 1];
        }
        int[] leftRightDifference = new int[len];
        for (int i = 0; i < len; i++) {
            leftRightDifference[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return leftRightDifference;
    }
}