package academy.learnprogramming;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int x, int y, int s) {
        if (!isValid(x) || !isValid(y) || !isValid(s)) return false;


        int digitX = x % 10;
        int digitY = y % 10;
        int digitS = s % 10;

        return (digitX == digitY || digitX == digitS || digitS == digitY);
    }

    public static boolean isValid (int number) {
        return (number >= 10 && number <= 1000);
    }
}
