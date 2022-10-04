package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        boolean result = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(result);
    }
}

/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and
it needs to return true if the sum of the first and second parameter is equal to the third parameter.
Otherwise, return false.
 */