class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] runningSum = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
            runningSum[i] += sum;
        }
        return runningSum;
    }
}