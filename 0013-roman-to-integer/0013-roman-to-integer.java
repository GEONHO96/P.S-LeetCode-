import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            int curr = roman.get(s.charAt(i));
            int next = roman.get(s.charAt(i + 1));
            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        sum += roman.get(s.charAt(n - 1));
        return sum;
    } 
}