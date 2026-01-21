import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger bInt1 = new BigInteger(num1);
        BigInteger bInt2 = new BigInteger(num2);
        return String.valueOf(bInt1.add(bInt2));
    }
}