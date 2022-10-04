package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i;
        for (i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                System.out.println(i);
                sum = sum + i;
                if (count == 5) {
                    System.out.println("The end of the loop");
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}