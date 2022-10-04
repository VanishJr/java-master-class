package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNexInt = scanner.hasNextInt();

        if (hasNexInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Cannot parse that value");
        }
        scanner.close(); // if we don't need scanner anymore
    }
}