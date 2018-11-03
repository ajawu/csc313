/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturefiveandsix;
import javax.swing.JFrame;
import java.io.*;
import java.util.*;

/**
 *
 * @author CSTLAB 124
 */
public class LectureFiveAndSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
//        Exercise 3 Lecture 5 - writing to files
        final Formatter format;
        try{
            format = new Formatter("c:\\code\\javaLecture.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\code\\javaLecture.txt"));
            bw.write("I love CSC 313");
            bw.newLine();
            bw.write("I hope you do too");
            bw.close();
        }catch(Exception e){
            System.out.println("Write error occured");
        }
        
        try { 
            BufferedReader br = new BufferedReader(new FileReader("C:\\code\\javaLecture.txt"));        
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);}
             br.close();
         }catch (Exception e) {
            System.out.println("Read error occured");
         }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter g to move on to gui exercises: ");
        String response = scan.nextLine().toLowerCase();

        if (response.equalsIgnoreCase("g")){
            BurgerRegistration calculator = new BurgerRegistration();
            calculator.setVisible(true);
        }else{
           System.out.println("Exiting now"); 
        }
    }
    
}
