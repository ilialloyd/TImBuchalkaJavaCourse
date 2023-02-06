/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/31/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class SecondsAndMinutes {

    public static void main(String[] args) {
        // getDurationString(6006);
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }

    public static String getDurationString(long min, long sec) {
        long hours;
        long rmin;

        if (!(min >= 0) || !(sec >= 0 || sec <= 59)) {
            return "Invalid value";
        }else
            hours = min / 60;
        rmin = min % 60;


        return hours + "h " + rmin + "m " + sec + "s";

    }

    public static String getDurationString(long sec) {
        if (!(sec >= 0)) {
            return "Invalid value";
        }

        long min = sec / 60;
        long rsecond = sec % 60;

        //System.out.println(sec + " seconds are: " + min + " minutes");
        return getDurationString(min, rsecond);
    }
}
