package academy.learnprogramming;

public class SharedDigit {
    public static boolean hasSharedDigit (int f, int s) {
        if (f < 10 || f > 99 || s < 10 || s > 99 ) return false;

        int tempS = s;
        int digitF = 0;
        int digitS = 0;

        while (f > 0){
            digitF = f % 10;
            while (tempS > 0) {
                digitS = tempS % 10;
                if (digitF == digitS) {
                    return true;
                }
                tempS /= 10;
            }
            tempS = s;
            f /= 10;
        }
        return false;
    }
}
