package academy.learnprogramming;

public class MTYandDC {
    public static void printYearsAndDays (long minutes) {
        if (minutes >= 0) {
            long year = minutes / 525600;
            System.out.println(year);
            long days = (minutes / (24 * 60) - 365);
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
