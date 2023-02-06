package demo;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 9/2/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class BaseballCoach implements Couch{
    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practise";
    }
}
