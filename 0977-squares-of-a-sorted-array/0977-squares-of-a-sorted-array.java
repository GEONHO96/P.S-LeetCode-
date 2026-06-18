import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            nums[i] *= nums[i];
        }
        return nums;
    }
}