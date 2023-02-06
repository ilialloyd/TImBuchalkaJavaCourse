/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/31/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        double area = Math.PI * (radius * radius);
        return area;
    }

    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        double area = x * y;
        return area;
    }

    // write your code here
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;

            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        }else if (num1 == num2 && num2 == num3) {
            System.out.println("All Numbers are equal");
        }else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        while (summer == false) {
            if (!(temperature >= 25 && temperature <= 35)) {
                return false;
            }else {
                return true;
            }
        }
        while (summer == true) {
            if (!(temperature >= 25 && temperature <= 55)) {
                return false;
            }else {
                return true;
            }
        }
        return summer;

    }


    public static void main(String[] args) {
        printYearsAndDays(-525600);

    }
}
