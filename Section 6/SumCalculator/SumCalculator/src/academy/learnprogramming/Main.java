package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(7);
        calc.setSecondNumber(10);
        System.out.println("First number = " + calc.getFirstNumber());
        System.out.println("Second number = " + calc.getSecondNumber());
        System.out.println("First + second number = " + calc.getAdditionResult());
        System.out.println("First - second number = " + calc.getSubtractionResult());
        System.out.println("First * second number = " + calc.getMultiplicationResult());
        System.out.println("First / second number = " + calc.getDivisionResult());
    }
}