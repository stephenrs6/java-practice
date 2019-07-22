import java.util.Scanner; // Needed for the Scanner class

public class Temperature {

    private double ftemp;

    public Temperature(double farGiven) {
        ftemp = farGiven;
    }

    public void setFahrenheit(double farGiven) {
        ftemp = farGiven;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public double getCelsius() {
        return (5 / 9) * (this.ftemp - 32);
    }

    public double getKelvin() {
        return (5 / 9) * (this.ftemp - 32) + 273;
    }

    public static void main(String[] args) {
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        double ftemp;

        System.out.print("Enter a Fahrenheit Temperature:");
        ftemp = keyboard.nextDouble();

        Temperature temp = new Temperature(ftemp);

        System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
        System.out.println("The temperature in Celsius is " + temp.getCelsius());
        System.out.println("The temperature in Kelvin is " + temp.getKelvin());
    }

}
