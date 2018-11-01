/**
 * 
 * @author ajawudavid
 */
import java.util.Scanner;

public class TenInTen{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter word to be searched: ");
        String word = scan.nextLine();
        System.out.print("Enter letter to search for: ");
        String letter = scan.nextLine();
        int index = word.indexOf(letter);
        while(index != -1){
            System.out.println(index);
            index = word.indexOf(letter, index + 1);
        }
    }
}