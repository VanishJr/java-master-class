package academic.learnprogramming;

public class Main
{
    //let's train how to use primitive data types like byte, short, long and int
    public static void main (String[] args)
    {
        int myValue = 10000; //how to write primitive types

        int intMaxValue = Integer.MAX_VALUE; //showing the max value of integer
        int intMinValue = Integer.MIN_VALUE; //showing the min value of integer

        System.out.println("My value is " + myValue);
        System.out.println("Max value is " + intMaxValue);
        System.out.println("Min value is " + intMinValue);

        short shortMaxValue = Short.MAX_VALUE; //showing the max value of short
        short shortMinValue = Short.MIN_VALUE; //showing the min value of short

        System.out.println("Max value is " + shortMaxValue);
        System.out.println("Min value is " + shortMinValue);

        byte byteMaxValue = Byte.MAX_VALUE; //showing the max value of byte
        byte byteMinValue = Byte.MIN_VALUE; //showing the min value of byte

        System.out.println("Max value is " + byteMaxValue);
        System.out.println("Min value is " + byteMinValue);

        long longMaxValue = Long.MAX_VALUE; //showing the max value of long
        long longMinValue = Long.MIN_VALUE; //showing the min value of long

        System.out.println("Max value is " + longMaxValue);
        System.out.println("Min value is " + longMinValue);


        /*
        CHALLENGE
        To calculate sum of bytes, shorts and ints values (converting "sum" into integer).
        After, add sum into long type.
        */

        //result
        int intValue = 50;
        short shortValue = 20;
        long longValue = 50000L;
        byte byteValue = 10;

        int sum = 10 * ((byte) (byteValue) + (short) (shortValue) + intValue);
        System.out.println("Sum of bytes, shorts and ints is " + sum);

        long end = longValue + sum;

        System.out.println("The end of the challenge is " + end);

    }
}
