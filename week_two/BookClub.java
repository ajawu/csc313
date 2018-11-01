/**
 * 
 * @author ajawudavid
 */

import java.util.Scanner;

public class BookClub{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of books purchased this month: ");
        int numBooks = scan.nextInt(); // Number of books purchased in the month
        int points = 0;
        if (numBooks > 0){
            switch(numBooks){
                case 0: points = 0;
                break;
                case 1: points = 5;
                break;
                case 2: points = 15;
                break;
                case 3: points = 30;
                break;
                case 4: points = 60;
                break;
                default: points = 60;
                break;
            }
        }else{
            points = 0;
        }
        System.out.println("Number of points gained for this month: " + points);
        scan.close();
    }
}