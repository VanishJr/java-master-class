package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10.000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10.000 at 4% interest = " + calculateInterest(10000, 4));
        System.out.println("10.000 at 5% interest = " + calculateInterest(10000, 5));

        System.out.println("****************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("****************");

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
            // String.format("%.2f") is formatting the output will be shown with 2 decimal points
        }

        System.out.println("****************");

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (int i = 8; i > 1; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));

        }

        System.out.println("****************");

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        for (int number = 10000; number <= 100000; number++) {
            if (isPrime(number) == true ) {
                count++;
                System.out.println(number);
                if (count == 3) {
                    System.out.println("Exiting from the loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}