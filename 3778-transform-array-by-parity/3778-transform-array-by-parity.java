import java.util.Arrays;

class Solution {
    public int[] transformArray(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 0) answer[i] = 0;
            else answer[i] = 1;
        }
        Arrays.sort(answer);
        return answer;
    }
}