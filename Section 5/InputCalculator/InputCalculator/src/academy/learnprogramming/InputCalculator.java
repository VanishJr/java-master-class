package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        int count = 0;
        int average = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                number = scanner.nextInt();

                sum += number;

                count++;

            } else {
                break;
            }

            average = sum;
            average = (int) Math.round(( (double) average / (double) count));

            scanner.nextLine();

        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
