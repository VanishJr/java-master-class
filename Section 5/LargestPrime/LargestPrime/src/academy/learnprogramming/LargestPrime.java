package academy.learnprogramming;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0) return -1;
        boolean flag_prime = true;
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                flag_prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        // Not Prime
                        flag_prime = false;
                    }
                }
                if (flag_prime) {
                    if (i == 1) return -1;
                    return i;
                }
            }
        }
        return -1;
    }
}
