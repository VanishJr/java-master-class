package academy.learnprogramming;

public class PerfectNumber {
    public static boolean isPerfectNumber (int number) {
        int sum = 0;

        if (number < 1) return false;

        for (int n = number - 1 ; n > 0; n--) {
            if (number % n == 0) {
                sum += n;
                if (sum == number) {
                    return true;
                }
            }

        }
        return false;
    }
}
