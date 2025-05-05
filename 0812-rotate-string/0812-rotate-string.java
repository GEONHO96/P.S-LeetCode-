class Solution {
    public boolean rotateString(String s, String goal) {
        String newS = s + s;
        if (newS.contains(goal) && s.length() == goal.length()) return true;
        else return false;
    }
}