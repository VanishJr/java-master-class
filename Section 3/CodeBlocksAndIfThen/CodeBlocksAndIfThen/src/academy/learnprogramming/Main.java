package academy.learnprogramming;

public class Main
{
    public static void main(String[] args) {
        int highScorePosition;

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ann", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("George", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int playerScore) {
        System.out.println(playerName + " managed to get into position "
                + playerScore + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
        int position = 4;
        if (playerScore > 1000) {
            position = 1;
        } else if ((playerScore > 500) && (playerScore <= 1000)) {
            position = 2;
        } else if ((playerScore >= 100) && (playerScore <= 500)) {
            position = 3;
        }
        return position;
    }
}
