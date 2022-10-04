package academy.learnprogramming;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        int sum = 0;
        int digit;
        if (number < 0) return -1;

        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 1) {
                number /= 10;
            } else if (digit % 2 == 0) {
                sum += digit;
                number /= 10;
            }
        }
        return sum;
    }
}
