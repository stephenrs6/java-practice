import java.util.Scanner;


/**
 * DistanceTravelled
 */
public class DistanceTravelled {

    public static void main(String[] args) {
        int distance = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter vehicle speed (in mph): ");
        int speed = keyboard.nextInt();
        while (speed < 0) {
            System.out.print("Enter time travelled (in hrs): ");
            speed = keyboard.nextInt();
        }
        System.out.print("Enter time travelled (in hrs): ");
        int time = keyboard.nextInt();
        while (time <= 0) {
            System.out.print("Enter time travelled (in hrs): ");
            time = keyboard.nextInt();
        }
        System.out.println("Hour    Distance Travelled");
        System.out.println("--------------------------");
        for (int hour = 1; hour <= time; hour++) {
            distance += speed;
            System.out.println(hour + "		" + distance);
        }
    }

    public static void printAttitude(int x) {
        if (x = 1) {
            System.out.println("disagree");
        } else if (x = 2) {
            System.out.println("no opinion");
        } else if (x = 3) {
            System.out.println("agree");
        } else {

        }
    }

    public void dashedLine(int x) {
        if (x > 0) {
            for (int count = 1; count <= x; count++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }

}