class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int len = operations.length;
        for (int i = 0; i < len; i++) {
            if (operations[i].equals("++X")) x += 1;
            else if (operations[i].equals("X++")) x += 1;
            else if (operations[i].equals("--X")) x -= 1;
            else if (operations[i].equals("X--")) x -= 1;
        }
        return x;
    }
}