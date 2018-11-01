/**
 * 
 * @author ajawudavid
 */

import java.util.Scanner;
public class ChangeNairaGame{
    public static boolean notesCalculator(int denomination, int numberNotes){
        if (denomination * numberNotes == 100){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int naira_notes = -1;

        System.out.println("Enter number of five naira notes required to make a hundred naira");
        naira_notes = scan.nextInt();

        if (notesCalculator(5, naira_notes)){
            System.out.println("Enter number of ten naira notes required to make a hundred naira");
            naira_notes = scan.nextInt();

            if (notesCalculator(10, naira_notes)){
                System.out.println("Enter number of twenty naira notes required to make a hundred naira");
                naira_notes = scan.nextInt();
                
                if (notesCalculator(20, naira_notes)){
                    System.out.println("Enter number of fifty naira notes required to make a hundred naira");
                    naira_notes = scan.nextInt();

                    if (notesCalculator(50, naira_notes)){
                        System.out.println("You just won the naira game");
                    }else{
                        System.out.println("You just lost the naira game");
                    }
                }else{
                    System.out.println("You just lost the naira game");
                }
            }else{
                System.out.println("You just lost the naira game");
            }
        }else{
            System.out.println("You just lost the naira game");
        }
        scan.close();
    }
}