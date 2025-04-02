class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int ascii = 0;
            if (s.charAt(i) == 'a') ascii = 26;
            if (s.charAt(i) == 'b') ascii = 25;
            if (s.charAt(i) == 'c') ascii = 24;
            if (s.charAt(i) == 'd') ascii = 23;
            if (s.charAt(i) == 'e') ascii = 22;
            if (s.charAt(i) == 'f') ascii = 21;
            if (s.charAt(i) == 'g') ascii = 20;
            if (s.charAt(i) == 'h') ascii = 19;
            if (s.charAt(i) == 'i') ascii = 18;
            if (s.charAt(i) == 'j') ascii = 17;
            if (s.charAt(i) == 'k') ascii = 16;
            if (s.charAt(i) == 'l') ascii = 15;
            if (s.charAt(i) == 'm') ascii = 14;
            if (s.charAt(i) == 'n') ascii = 13;
            if (s.charAt(i) == 'o') ascii = 12;
            if (s.charAt(i) == 'p') ascii = 11;
            if (s.charAt(i) == 'q') ascii = 10;
            if (s.charAt(i) == 'r') ascii = 9;
            if (s.charAt(i) == 's') ascii = 8;
            if (s.charAt(i) == 't') ascii = 7;
            if (s.charAt(i) == 'u') ascii = 6;
            if (s.charAt(i) == 'v') ascii = 5;
            if (s.charAt(i) == 'w') ascii = 4;
            if (s.charAt(i) == 'x') ascii = 3;
            if (s.charAt(i) == 'y') ascii = 2;
            if (s.charAt(i) == 'z') ascii = 1;
            sum += (i + 1) * ascii;
        }
        return sum;
    }
}