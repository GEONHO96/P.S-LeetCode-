class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int count = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1[i] % (k * nums2[j]) == 0) count++;
            }
        }
        return count;
    }
}