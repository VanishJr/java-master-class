package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(3.1756, 3.175);
        System.out.println(result);
    }
}

/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean
and it needs to return true if two double numbers are the same up to three decimal places.
Otherwise, return false.
 */