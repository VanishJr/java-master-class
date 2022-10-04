package academy.learnprogramming;

public class SecondsAndMinutes {
    public static String getDurationString (long minutes, long seconds) {
        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
        }
        return "Invalid Value";
    }

    public static String getDurationString (long seconds) {
        if (seconds >= 0) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            System.out.println(seconds + " equals to " + minutes + " minutes and " + remainingSeconds + "seconds");
            return getDurationString(minutes, remainingSeconds);
        }
        return "Invalid Value";

    }
}
