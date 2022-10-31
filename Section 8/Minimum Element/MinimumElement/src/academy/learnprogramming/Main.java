package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the number which represents amount of elements");
        int x = scanner.nextInt();
        scanner.nextLine();
        return x;
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the numbers");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}