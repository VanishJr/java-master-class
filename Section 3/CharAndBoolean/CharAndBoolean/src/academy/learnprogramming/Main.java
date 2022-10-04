package academy.learnprogramming;

public class Main
{
    //learning char and boolean
    //for char use site https://unicode-table.com/en/#control-character
    public static void main(String[] args)
    {
        //make some chars

        char myChar = 'D';
        char myUnicodeChar = '\u0044';  //letter D from the table
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char copyRightChar = '\u00A9';  // CopyRight symbol
        System.out.println(copyRightChar);


        //make some booleans

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
