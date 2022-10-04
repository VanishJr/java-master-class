package academy.learnprogramming;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int x, int y) {
        if (x < 10 || y < 10) return -1;

        for (int s = x; s >= 2; s--) {
            if (x % s == 0 && y % s == 0) {
                return s;
            }
        }
        return -1;
    }
}
