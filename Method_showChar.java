import java.util.Scanner;
public class Method_showChar {
    public static void showChar(String str, int i) {
        System.out.printf("%c%n", str.charAt(i));
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a line of text: ");
        String line = input.nextLine();
        System.out.printf("Enter your index: ");
        showChar(line, input.nextInt());
        return;
    }
}