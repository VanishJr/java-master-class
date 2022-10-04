package academy.learnprogramming;

public class NumberToWords {
    public static void numberToWords (int number) {
        int digitsNumber = number;
        int lastNumber = 0;

        int reverse = reverse(number);
        int lastReverse = reverse;
        if (number < 0) System.out.println("Invalid Value");

        while (digitsNumber > 0) {
            lastNumber = digitsNumber % 10;
            switch (lastNumber) {
                case 0:
                    System.out.print("Zero" + " ");
                    break;
                case 1:
                    System.out.print("One" + " ");
                    break;
                case 2:
                    System.out.print("Two" + " ");
                    break;
                case 3:
                    System.out.print("Three" + " ");
                    break;
                case 4:
                    System.out.print("Four" + " ");
                    break;
                case 5:
                    System.out.print("Five" + " ");
                    break;
                case 6:
                    System.out.print("Six" + " ");
                    break;
                case 7:
                    System.out.print("Seven" + " ");
                    break;
                case 8:
                    System.out.print("Eight" + " ");
                    break;
                case 9:
                    System.out.print("Nine" + " ");
                    break;
                default:
                    System.out.print("Invalid Value");
                    break;
            }
            digitsNumber /= 10;
        }
        if (getDigitCount(number) != getDigitCount(lastReverse)) {
            int diff = getDigitCount(number) - getDigitCount(lastReverse);
            for (int i = 0; i < diff; i++) {
                System.out.print("Zero" + " ");
            }
        }
        System.out.println("");
    }

    public static int reverse (int number) {
        boolean isNegative = number != Math.abs(number);
        number = Math.abs(number);
        int reverse = 0;
        int place = (int) Math.pow(10, getDigitCount(number)-1);
        int n = number;
        while (n > 0) {
            reverse += (n % 10) * place;
            place = place / 10;
            n /= 10;
        }
        return isNegative ? (-1 * reverse) : reverse;
    }

    public static int getDigitCount (int number) {
        if (number < 0) return -1;
        return (number + "").length();
    }
}
