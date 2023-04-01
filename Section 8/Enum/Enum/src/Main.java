import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek weekday = DaysOfTheWeek.FRI;
        System.out.println(weekday);


//        for (int i = 0; i < 10; i++) {
//
//            weekday = randomDay();
//
//            if (weekday == DaysOfTheWeek.FRI) {
//                System.out.println("IT IS A FRIDAY");
//            }
//            System.out.printf("This is %s, Ordinal value is %d%n",
//                    weekday.name(), weekday.ordinal());
//
//        }

        switchDayOfWeek(weekday);


    }

    public static void switchDayOfWeek (DaysOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal()+1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);
        }
    }

    public static DaysOfTheWeek randomDay() {
        int random = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();

        return allDays[random];
    }
}