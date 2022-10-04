package academy.learnprogramming;

public class Main
{
    //learning of how to use primitive types like float and double
        public static void main(String[] args)
        {

            float floatMaxValue = Float.MAX_VALUE;
            float floatMinValue = Float.MIN_VALUE;
            System.out.println("Max value is " + floatMaxValue);
            System.out.println("Min value is " + floatMinValue);

            double doubleMaxValue = Double.MAX_VALUE;
            double doubleMinValue = Double.MIN_VALUE;
            System.out.println("Max value is " + doubleMaxValue);
            System.out.println("Min value is " + doubleMinValue);

            //testing of working 
            int myIntValue = 5 / 3;
            float myFloatValue = 5f / 3f;
            double myDoubleValue = 5.00 / 3.00;
            System.out.println("MyIntValue = " + myIntValue);
            System.out.println("MyFloatValue = " + myFloatValue);
            System.out.println("MyDoubleValue = " + myDoubleValue);

            /*
            CHALLENGE
            convert pounds to kilograms
             */

            double pounds = 200d;
            double convertedKilograms = pounds * 0.45359237d;
            System.out.println("The result of converting pound to kg is " + convertedKilograms);

            double justNumber = 3_00_000.39204;
            System.out.println(justNumber);


        }
}
