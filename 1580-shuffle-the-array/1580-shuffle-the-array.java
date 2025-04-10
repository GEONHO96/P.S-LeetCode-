import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        int l = 0;
        while (l < n) {
            for (int i = 0; i < len; i++) {
                if (i % n == l) {
                    list.add(nums[i]);
                }
            }
            l++;
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}