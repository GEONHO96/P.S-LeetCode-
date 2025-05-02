class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int elementSum = 0;
        for (int i = 0; i < n; i++) {
            elementSum += nums[i];
        }
        int digitSum = 0;
        for (int i = 0; i < n; i++) {
            int m = String.valueOf(nums[i]).length();
            for (int j = 0; j < m; j++) {
                digitSum += Integer.parseInt(String.valueOf(String.valueOf(nums[i]).charAt(j)));
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}