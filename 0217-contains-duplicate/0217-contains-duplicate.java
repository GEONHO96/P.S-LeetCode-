import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean satisfied = false;
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                satisfied = true;
                break;
            }
        }
        return satisfied;
    }
}