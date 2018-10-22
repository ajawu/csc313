/**
 * 
 * @author ajawudavid
 */
import java.util.Scanner;
public class ColorMixer{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a primary color: ");
        String colorOne = scan.nextLine().toLowerCase();
        System.out.println("Enter a second primary color: ");
        String colorTwo = scan.nextLine().toLowerCase();
        if (colorOne == colorTwo){
            System.out.println("Resultant secondary color: " + colorOne);
        }else if ((colorOne == "red" | colorOne == "blue") && (colorTwo == "blue" | colorTwo == "red")){
            System.out.println("Resultant secondary color: purple");
        }else if ((colorOne == "red" | colorOne == "yellow") && (colorTwo == "yellow" | colorTwo == "red")){
            System.out.println("Resultant secondary color: yellow");
        }else if ((colorOne == "blue" | colorOne == "yellow") && (colorTwo == "yellow" | colorTwo == "blue")){
            System.out.println("Resultant secondary color: green");
        }else{
            System.out.println("Invalid primary color detected");
        }
    }
}