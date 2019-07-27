import java.util.*;
/**
 * LandTract
 */
public class LandTract {
    private int length;
    private int width;
    private int area;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LandTract t1 = new LandTract();
        LandTract t2 = new LandTract();
        System.out.print("Enter length of first land tract:");
        t1.length = input.nextInt();
        System.out.print("Enter width of first land tract:");
        t1.width = input.nextInt();
        System.out.print("Enter length of second land tract:");
        t2.length = input.nextInt();
        System.out.print("Enter width of second land tract:");
        t2.width = input.nextInt();
        System.out.println(t1.toString()+" and area "+t1.area());
        System.out.println(t2.toString()+" and area "+t2.area());
        if(t1.equals(t2))
            System.out.println("The two tracts have the same size.");
        else
            System.out.println("The two tracts do not have the same size."); 
    }
    
    public int area() {
        return length * width;
    }

    public boolean equals(LandTract landobj)
    {
    if((length==landobj.length && width==landobj.width) || (length==landobj.width && width==landobj.length)) 
        return true;
        return false;
    }

    public String toString() {
        return "LandTract with length " + length + ", width " + width + ",";
        
    }
}