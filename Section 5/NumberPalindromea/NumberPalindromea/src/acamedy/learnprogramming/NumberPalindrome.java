package acamedy.learnprogramming;

public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        number = Math.abs(number); // making the value always positive

        int reverse = 0;
        int digits;
        int sameNumber = number;

        digits = (int) Math.pow(10, (number + "").length()-1); // outputting last number to the forward

        while (sameNumber > 0) {
            reverse = reverse + ((sameNumber % 10) * digits);
            digits = digits / 10;
            sameNumber /= 10;
        }

        if (reverse == number) {
            return true;
        }
        return false;
    }
}
