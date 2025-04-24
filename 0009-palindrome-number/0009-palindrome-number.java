class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = false;
        String s = String.valueOf(x);
        int n = s.length();
        String k = "";
        for (int i = 0; i < n; i++) {
            k += s.charAt(n - i - 1);
        }
        if (k.equals(s)) ans = true;
        return ans;
    }
}