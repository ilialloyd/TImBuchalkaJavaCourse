/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/29/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class SpeedConverter {


    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
           return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = Math.round(toMilesPerHour(kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
