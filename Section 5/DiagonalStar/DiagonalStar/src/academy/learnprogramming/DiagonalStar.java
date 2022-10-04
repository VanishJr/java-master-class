package academy.learnprogramming;

public class DiagonalStar {
    public static void printSquareStar (int number) {
        if (number < 5) System.out.println("Invalid Value");

        for (int i = 0; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int row = 1; row < number - 1; row++) {
            System.out.print("*");
            for (int column = 1; column < number - 1; column++) {
                if (row == column || number - row - 1 == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }

        for (int i = 0; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }
}
