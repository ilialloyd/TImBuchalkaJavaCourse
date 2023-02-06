package demo;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 9/2/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        HappyFortuneService myFortuneService =
                new HappyFortuneService();

        BaseballCoach myCoach =
                new BaseballCoach(myFortuneService);

        System.out.println(myCoach.getDailyWorkout());
    }

}
