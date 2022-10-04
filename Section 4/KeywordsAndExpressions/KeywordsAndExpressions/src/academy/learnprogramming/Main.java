package academy.learnprogramming;

public class Main
{
    public static void main(String args[])
    {
        int int2=5; //you can use a reserved keyword 'int'

        // Expressions

        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344); //'kilometres = (100 * 1.609344)' - expression

        int highSCore = 50; // 'highSCore == 50' - expression
        if (highSCore == 50) // 'highSCore == 50' - expression
        {
            System.out.println("This is an expression too");
        }

        // Challenge
        //In the following code that I will type below, write down what parts of the code are expressions
        int score = 100;
        if (score > 99)
        {
            System.out.println("You got the high score!");
            score = 0;
        }

        /*  Answers
        score = 100
        score > 99
        "You got the high score!"
        score = 0
         */

    }
}
