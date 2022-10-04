package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        boolean result = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(result);

        boolean result2 = TeenNumberChecker.isTeen(9);
        System.out.println(result2);
    }
}