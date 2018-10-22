import java.util.Scanner;
/**
 * 
 * @author ajawudavid
 */

public class NumberParity{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to determine the parity: ");
        int number = scan.nextInt();
        if (number % 2 == 0){
            System.out.println("Number entered is an even number");
        }else{
            System.out.println("Number enetered is not an even number");
        }
        scan.close();
    }
}