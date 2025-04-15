class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        int[] finalState = new int[n];
        for (int i = 0; i < n; i++) {
            finalState[i] = nums[i];
        }
        while (k > 0) {
            int min = finalState[0];
            int minIdx = n - 1;
            for (int i = 0; i < n; i++) {
                min = Math.min(min, finalState[i]);
            }
            for (int i = 0; i < n; i++) {
                if (min == finalState[i]) {
                    minIdx = Math.min(minIdx, i);
                }
            }
            finalState[minIdx] *= multiplier;
            k--;
        }
        return finalState;
    }
}