/**
 * 
 * @author ajawudavid
 */
import java.util.Scanner;
public class MassAndWeight{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mass of object: ");
        double weight = scan.nextDouble();
        weight *= 9.8;

        if (weight > 1000){
            System.out.println("Object is too heavy");
        }else if (weight < 10){
            System.out.println("Object is too light");
        }else{
            System.out.println("Object is aiit");            
        }
        scan.close();
    }
}