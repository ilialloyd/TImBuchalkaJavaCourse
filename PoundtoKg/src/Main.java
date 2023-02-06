/**
 * Created by IntelliJ IDEA.
 * User: ${USER}
 * Date: ${DATE}
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {

        double pound=12;
        double kg =pound* 0.453592;

        System.out.println(pound+" pound is equal to "+kg +" kg");


        String a = "salam";
        String text = a.equals("salam")? "Yes":"no";
        System.out.println(text);


        double d1 = 20.00;
        double d2= 80.00;
        double result = (d1+d2)*100;
        System.out.println("result= "+result);
        double rem = result% 40.00;
        System.out.println("remainder= "+rem);

        boolean b = rem==0 ? true:false;
        System.out.println("boolean = "+b);

        if(b!=true){
            System.out.println("got some remainder");
        }







    }
}