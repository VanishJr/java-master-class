package academy.learnprogramming;

public class Main
{
    public static void main(String[] args)
    {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        //let's make myString
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        //continuing example by adding new string by using operator "+"
        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " + myString);
        //continuing example by adding char to myString
        myString = myString + " \u00a9 2019";
        System.out.println("myString is equal to: " + myString);

        //experiment with numbers
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        //answer is 250.5549.95 because it is just a symbols which we cannot add by maths

        //new experiment with string and int
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        //answer is "LastString is equal to 1050" because Java converting in these situations integer to a string

        //the same with a double data type
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
        /*
        answer is "LastString is equal to 1050120.47"
            because STRING IS IMMUTABLE
         */

    }
}
