import java.util.Scanner;
/**
 * This program displays a triangle pattern.
 */
public class TrianglePattern {
    public static void main(String[] args) {
        final int n = 8;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < (i + 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}