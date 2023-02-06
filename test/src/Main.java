/**
 * Created by IntelliJ IDEA.
 * User: ${USER}
 * Date: ${DATE}
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {

       String s = "teeter";

       for(char i :s.toCharArray()){
           if (s.indexOf(i) == s.lastIndexOf(i)) {

               System.out.println("First unrepead letter is: "+i);
           }
       }




    }


}