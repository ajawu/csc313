/**
 * 
 * @author ajawudavid
 */

import java.util.Scanner;

public class SoftwareSales{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter number of packages purchased this month: ");
        int numPackages = scan.nextInt();
        double totalCost = numPackages * 99;
        double discount = 0;

        if (numPackages >= 10 && numPackages <= 19){
            discount = 0.2;
        }else if (numPackages >= 20 && numPackages <= 49){
            discount = 0.3;
        }else if (numPackages >= 50 && numPackages <= 99){
            discount = 0.4;
        }else if (numPackages >= 100){
            discount = 0.5;
        }

        discount *= totalCost;
        totalCost -= discount;
        System.out.println("Total discount: " + discount);
        System.out.println("Total discount: " + totalCost);
        scan.close();
    }
}