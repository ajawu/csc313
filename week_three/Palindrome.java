/**
 * 
 * @author ajawudavid
 */

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word to be checked: ");
        String word = scan.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1 ; i >= 0 ; i--)
        reversedWord = reversedWord + word.charAt(i);

        if (word.equals(reversedWord)){
            System.out.println("Word entered is a palindrome");
        }else{
            System.out.println("Word entered is not a palindrome");
        }

        scan.close();
    }
}