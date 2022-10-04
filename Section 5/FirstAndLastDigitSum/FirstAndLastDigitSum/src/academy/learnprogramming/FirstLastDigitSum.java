package academy.learnprogramming;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        int firstDigit = 0;
        int lastDigit ;

        if (number < 0) return -1;

        lastDigit = number % 10; //first number

        while(number > 0) {
            firstDigit = number;   // 252/10=25 => 25/10=2 => 2
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
