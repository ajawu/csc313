/**
 * 
 * @author ajawudavid
 */

import java.util.Scanner;

class ShapeAreas{
    Scanner scan = new Scanner(System.in);

    public double areaRectangle(){
        System.out.print("Enter length of rectangle: ");
        double length = scan.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scan.nextDouble();
        return length * breadth;
    }

    public double areaTriangle(){
        System.out.print("Enter base of triangle: ");
        double base = scan.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scan.nextDouble();
        return 0.5 * (base * height);
    }

    public double areaCircle(){
        System.out.print("Enter radius of circle: ");
        double radius = scan.nextDouble();
        return 3.143 * (radius * radius);
    }
}

public class ShapesDemo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter shape to calculate area: ");
        String shape = scan.nextLine().toLowerCase();
        ShapeAreas demo = new ShapeAreas();

        if (shape.equalsIgnoreCase("circle")){
            System.out.println("Area of circle with specified dimensions is " + demo.areaCircle());
        }
        else if (shape.equalsIgnoreCase("triangle")){
            System.out.println("Area of circle with specified dimensions is " + demo.areaTriangle());
        }
        else if (shape.equalsIgnoreCase("rectangle")){
            System.out.println("Area of circle with specified dimensions is " + demo.areaRectangle());
        }
        else{
            System.out.println("I cannot calculate the area of specified shape.");
        }
        scan.close();
    }
}