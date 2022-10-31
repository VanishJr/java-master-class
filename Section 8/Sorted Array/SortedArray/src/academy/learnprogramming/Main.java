package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sortedIntegers = sortIntegers(myIntegers);
        printArray(sortedIntegers);
    }

    public static int[] getIntegers(int number) {
        int[] arr = new int[number];
        System.out.println("Enter " + number + " numbers \r");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element "  + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int[] sortedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            sortedArray[i] = arr[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}