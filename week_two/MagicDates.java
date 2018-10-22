/**
 * 
 * @author ajawudavid
 */
import java.util.Scanner;
public class MagicDates{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dates = new int[3];
        System.out.print("Enter day of month: ");
        dates[0] = scan.nextInt();
        System.out.print("Enter month in numeric form: ");
        dates[1] = scan.nextInt();
        System.out.print("Enter year in two digit form: ");      
        dates[2] = scan.nextInt();
        
        if (dates[0] * dates[1] == dates[2]){
            System.out.println("Date entered is magic.");
        }else{
            System.out.println("Date entered is not magic.");
        }
        scan.close();
    }
}