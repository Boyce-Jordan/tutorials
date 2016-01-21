/**
 * Created by JordanTBoyce on 1/19/2016.
 */
import java.util.Scanner;
public class Apples {
    public static void main(String[] args){
        /*A=P(1+R)^N*/

        double amount;
        double principle = 1000;
        double rate = .01;

        for(int day = 1; day <= 20; day++){
            amount = principle * Math.pow(1 + rate, day);
            System.out.println(day + "  " + amount);
        }
    }
}
