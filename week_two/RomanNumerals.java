import java.util.Scanner;
/**
 * 
 * @author ajawudavid
 */

public class RomanNumerals{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to convert to Roman numerals: ");
        int number = scan.nextInt();
        String romanNumerals = "";

        switch(number){
            case 1: romanNumerals = "I";
            break;
            case 2: romanNumerals = "II";
            break;
            case 3: romanNumerals = "III";
            break;
            case 4: romanNumerals = "IV";
            break;
            case 5: romanNumerals = "V";
            break;
            case 6: romanNumerals = "VI";
            break;
            case 7: romanNumerals = "VII";
            break;
            case 8: romanNumerals = "VII";
            break;
            case 9: romanNumerals = "IX";
            break;
            case 10: romanNumerals = "X";
            break;
        }

        System.out.println("The roman numeral equivalent of " + number + " is " + romanNumerals);
        scan.close();
    }
}