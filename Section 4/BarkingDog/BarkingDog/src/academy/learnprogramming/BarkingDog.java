package academy.learnprogramming;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (((hourOfDay >= 0) && (hourOfDay < 8))|| (hourOfDay > 22) && (hourOfDay < 24) ) {
            if (barking == true) {
                return barking = true;
            } else if (barking == false) {
                return barking = false;
            }
            return barking = false;
        }
        return barking = false;
    }
}

