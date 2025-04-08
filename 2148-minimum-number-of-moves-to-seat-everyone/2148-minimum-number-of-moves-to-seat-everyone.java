import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;
        int minMovesToSeat = 0;
        for (int i = 0; i < n; i++) {
            minMovesToSeat += Math.abs(seats[i] - students[i]);
        }
        return minMovesToSeat;
    }
}