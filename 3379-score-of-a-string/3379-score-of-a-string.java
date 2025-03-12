class Solution {
    public int scoreOfString(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0) sum = 0;
            else sum += Math.abs((int) (s.charAt(i) - s.charAt(i - 1)));
        }
        return sum;
    }
}