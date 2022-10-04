package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int numberAsInteger = Integer.parseInt(numberAsString); // parsing String numberAsStr// ing into int
        System.out.println("numberAsInteger = " + numberAsInteger);

        System.out.println("************************");

        numberAsString += 1;
        numberAsInteger += 1;

        System.out.println("numberAsString + 1 = " + numberAsInteger);
        System.out.println("numberAsInteger + 1 = " + numberAsString);

        System.out.println("************************");
//        numberAsString = "2018";
//        System.out.println(numberAsString);  will give you a mistake

        numberAsString = "2018.353";
        double numberAsDouble = Double.parseDouble(numberAsString);
        System.out.println("numberAsDouble = " + numberAsDouble);


    }
}