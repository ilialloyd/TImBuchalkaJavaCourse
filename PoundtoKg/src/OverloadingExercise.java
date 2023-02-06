/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/31/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class OverloadingExercise {
    public static void main(String[] args) {

        double inch = 100;
        if (!(inch > 0)) {
            System.out.println("Invalid number");
        }else {
           calcFeetAndInchesToCentimeters(inch);
           // double sm = calcFeetAndInchesToCentimeters(feet, inch);
//            System.out.println(inch + " inch = " + feet+" feet");
//            System.out.println(feet + " feet and " + inch + " inch is: " + sm + " sm");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        double sm;

        if(!(feet>=0) || !(inch>=0 || inch<=12)){
            return -1;
        }else {

            sm = feet*30.48;
            sm=sm+(inch*2.54);

        }
        System.out.println(feet + " feet and " + inch + " inch is: " + sm + " sm");
        return sm;
    }

    public static double calcFeetAndInchesToCentimeters(double inch){
        double inchToFeet;
        double remainingInch;
        if(!(inch>0)){
            return -1;
        }else{
             inchToFeet = (int)inch/12;
              remainingInch =(int) inch % 12;
        }
        System.out.println(inch + " inch = " + inchToFeet+" feet");
        return calcFeetAndInchesToCentimeters(inchToFeet,remainingInch);
    }


}
