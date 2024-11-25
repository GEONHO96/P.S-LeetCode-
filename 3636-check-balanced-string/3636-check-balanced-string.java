class Solution {
    public boolean isBalanced(String num) {
        int length = num.length();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                evenSum += Integer.parseInt(String.valueOf(num.charAt(i)));
            } else {
                oddSum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
        }
        if (oddSum == evenSum) return true;
        else return false;
    }
}