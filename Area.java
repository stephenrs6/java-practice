import java.util.*;
import java.io.*;
public class Area {
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double getArea(float width, float length) {
        return width*length;
    }

    public static double getArea(double radiusCy, double height) {
        return Math.PI * radiusCy * radiusCy * height;
    }

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("");
        System.out.print("Enter radius to calculate circle area:");
        double radius = keyboard.nextDouble();
        System.out.print(" Enter width to calculate rectangle area:");
        float width = keyboard.nextFloat();
        System.out.print(" Enter length to calculate rectangle area:");
        float length = keyboard.nextFloat();
        System.out.print(" Enter base radius to calculate cylinder area:");
        double radiusCy = keyboard.nextDouble();
        System.out.print(" Enter height to calculate cylinder area:");
        double height = keyboard.nextDouble();
        System.out.println("");
        System.out.println("--------");
        System.out.println("Results:");
        System.out.println("--------");
        System.out.println("");
        System.out.printf("The area of the circle is: %.2f", Area.getArea(radius));
        System.out.println("");
        System.out.printf("The area of the rectangle is: %.2f", Area.getArea(length,width));
        System.out.println("");
        System.out.printf("The area of the cylinder is: %.2f", Area.getArea(radiusCy,height));
    }
}