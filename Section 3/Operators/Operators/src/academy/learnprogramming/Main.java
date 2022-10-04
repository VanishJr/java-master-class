package academy.learnprogramming;

public class Main
{
    public static void main(String[] args)
    {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++;
        System.out.println("1 + 1 = " + result);

        // result = result - 1
        result--;
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) // == equal
        {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of them");
        }
        if (!isAlien) // !isAlien equals '== false'
        {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of them");
        }

        int topScore = 80;
        if (topScore == 100) // != not equal
        {
            System.out.println("You got the high score!");
        }
        if (topScore != 100) // != not equal
        {
            System.out.println("You got the high score!");
        }
        if (topScore >= 100) // >= greater than or equal to ...
        {
            System.out.println("You got the high score!");
        }
        if (topScore < 100) // >= less than ...
        {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) // && means AND   // making (( is easier to read
        {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) // || equals OR operator
        {
            System.out.println("Either or both of the condition are true");
        }

        boolean isCar = false;
        if (isCar) // isCar means == true
        {
            System.out.println("Yeah, it is true");
        }

        // TERNARY OPERATOR ?:
        // boolean isCar = false;
        boolean falseCar = isCar ? true : false; //checks isCar is true or false
        if (falseCar)
        {
            System.out.println("falseCar is true");
        }

        isCar = true;
        boolean trueWasCar = isCar ? true : false;
        if  (trueWasCar)
        {
            System.out.println("trueWasCar is true");
        }

        // more examples
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        if (isEighteenOrOver)
        {
            System.out.println("He can come to the club");
        }

        // challenge
        double firstNumber = 20.00;
        double secondNumber = 80.00;
        double stepThree = (secondNumber + firstNumber) * 100.00;
        System.out.println("stepThree = " + stepThree);

        double remainder = stepThree % 40.00;
        System.out.println("remainder = " + remainder);

        boolean checkRemainder = (remainder == 0) ? true : false;
        System.out.println("checkRemainder = " + checkRemainder);
        if (!checkRemainder)
        {
            System.out.println("Got some remainder");
        }
    }
}