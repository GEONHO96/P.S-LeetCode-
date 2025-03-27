class Solution {
    public int countDigits(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (num % Integer.parseInt(String.valueOf(s.charAt(i))) == 0) count++;
        }
        return count;
    }
}