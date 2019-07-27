import java.util.Scanner;
public class Area {
    public static double getArea(double radius) {
        return (Math.PI * (radius * radius));
    }
    public static double getArea(double length, double width) {
        return (length * width);
    }
    public static double getArea(float radius, float height) {
        return (Math.PI * (radius * radius) * height);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("=== Area Calculator ===%n%n"
                + "Enter radius to calculate circle area: ");
        double circRadius = input.nextDouble();
        System.out.printf("Enter width to calculate"
                + " rectangle area: ");
        double recWidth = input.nextDouble();
        System.out.printf("Enter length to calculate"
                + " rectangle area: ");
        double recLength = input.nextDouble();
        System.out.printf("Enter base radius to calculate"
                + " cylinder area: ");
        float cylRadius = input.nextFloat();
        System.out.printf("Enter height to calculate"
                + " cylinder area: ");
        float cylHeight = input.nextFloat();
        System.out.printf("%n--------%nResults:%n--------%n%n"
                + "The area of the circle is: %.2f%n"
                + "The area of the rectangle is: %.2f%n"
                + "The area of the cylinder is: %.2f%n",
                Area.getArea(circRadius),
                Area.getArea(recWidth, recLength),
                Area.getArea(cylRadius, cylHeight));
        return;
    }
}
