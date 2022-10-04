package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;

        int a1 = (int) firstNumber;
        int b1 = (int) secondNumber;

        if (a1 == b1) {
            return true;
        }
        return false;
    }
}
