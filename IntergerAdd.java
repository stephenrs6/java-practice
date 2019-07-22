import java.util.Scanner;

/**
 * IntergerAdd
 */
public class IntergerAdd {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int number = stdin.nextInt();
        while (stdin.hasNextInt() && number >= 0) {
            if (number > 100)
                System.out.print(number + " ");
        }
    }
}