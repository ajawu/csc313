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
        }else if ((colorOne.equals("red") | colorOne.equals("blue")) && (colorTwo.equals("blue") | colorTwo.equals("red"))){
            System.out.println("Resultant secondary color: purple");
        }else if ((colorOne.equals("red") | colorOne.equals("yellow")) && (colorTwo.equals("yellow") | colorTwo.equals("red"))){
            System.out.println("Resultant secondary color: yellow");
        }else if ((colorOne.equals("blue") | colorOne.equals("yellow")) && (colorTwo.equals("yellow") | colorTwo.equals("blue"))){
            System.out.println("Resultant secondary color: green");
        }else{
            System.out.println("Invalid primary color detected");
        }
        scan.close();
    }
}