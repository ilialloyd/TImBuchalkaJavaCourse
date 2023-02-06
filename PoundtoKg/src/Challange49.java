import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/29/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Challange49 {

    public static void displayHighScoreposition(String name, int position) {
        System.out.println(name + " managed to get into position " + position
                + " on the high score table");


    }

    public static int calculateHighScorePosition(int score) {
        //way1
//        if (score >=1000) {
//            return 1;
//        }else if (score >= 500 ) {
//            return 2;
//        }else if (score >= 100 ) {
//            return 3;
//        }
//        return 4; //way one
        //way2
        //way2
        int position=4; // we know that we need to return 4 in the end
        if(score>=1000) position=1;
        else if(score>=500) position=2;
        else if(score>=100) position=3;

        return position; //one return way

    }

    public static void main(String[] args) {
        String name = "Ilham";
        int position = 1500;
        displayHighScoreposition(name, calculateHighScorePosition(position));
        position = 900;
        displayHighScoreposition(name, calculateHighScorePosition(position));
        position = 400;
        displayHighScoreposition(name, calculateHighScorePosition(position));
        position = 50;
        displayHighScoreposition(name, calculateHighScorePosition(position));
        position = calculateHighScorePosition(500);
        displayHighScoreposition("Serxan",position);
    }
}

