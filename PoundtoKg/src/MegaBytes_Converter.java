import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 8/29/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class MegaBytes_Converter {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(isLeapYear(2024));

        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(hasTeen(85,23,28));
    }


    public static boolean hasTeen(int one,int two,int three){
        int [] arr = {one,two,three};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=13 && arr[i]<=19){
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int teen){
        if(!(teen<=13 && teen>=19)){
            return false;
        }
        return true;
    }


    public static boolean areEqualByThreeDecimalPlaces(double first,double second) {


            if (first <0 && second >0 || first >0 && second <0){
                return false;
            }

//           double first1 = first*1000;//3.176->3176
//            double second2 = second*1000;//3.175->3175
//
//            int i = (int)first1;
//            int j = (int)second2;

        int i = (int)(first*1000);
            int j = (int)(second*1000);

            if(i==j){
                return true;
            }
            return false;


    }




    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }else{
            if(!(year%4==0)){
                return false;
            }else{
                if(!(year%100==0)){
                    return true;
                }else{
                    if(!(year%400==0)){
                        return false;
                    }
                    return true;
                }
            }
        }


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23) {

            if (hourOfDay <= 7 || hourOfDay >= 23) {
                return barking;
            }

        }else{
            return false;
        }

        return false;



//        public static void printMegaBytesAndKilobytes(int kiloBytes){
//            int megaBytes = 1024;
//            if (kiloBytes < 0) {
//                System.out.println("Invalid Value");
//            }else {
//
//                int mb = kiloBytes / megaBytes;
//                int remainder = kiloBytes % megaBytes;
//                System.out.println(kiloBytes + " KB =" + mb + "MB and " + remainder + " KB");
//            }
//
//
//        }

    }
}
