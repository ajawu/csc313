/**
 * 
 * @author ajawudavid
 */

import java.util.Scanner;

public class TimeCalculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int numberSeconds = scan.nextInt();
        if (numberSeconds >= 86400){
            System.out.println(numberSeconds + " make " + Math.round(numberSeconds / 86400) + " hour(s)");
        }else if (numberSeconds >= 3600){
            System.out.println(numberSeconds + " make " + Math.round(numberSeconds / 3600) + " hour(s)");
        }else if (numberSeconds >= 60){
            System.out.println(numberSeconds + " make " + Math.round(numberSeconds / 60) + " minute(s)");
        }else{
            System.out.println("To small to be converted");
        }
        scan.close();
    }
}