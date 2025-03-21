class Solution {
    public String truncateSentence(String s, int k) {
        String[] input = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i != k - 1) sb.append(input[i] + " ");
            else sb.append(input[i]);
        }
        return sb.toString();
    }
}