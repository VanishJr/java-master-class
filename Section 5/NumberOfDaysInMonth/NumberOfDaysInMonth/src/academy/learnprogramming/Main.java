package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        boolean result1 = NumberOfDaysInMonth.isLeapYear(1924);
        System.out.println(result1);

        int result2 = NumberOfDaysInMonth.getDaysInMonth(12, 10000);
        System.out.println(result2);
    }
}