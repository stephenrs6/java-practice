import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);

        int numOfTest;

        System.out.print("Enter number of test scores:");
        numOfTest = KB.nextInt();

        double[] testScores = new double[numOfTest];
        TestScore test = new TestScore(testScores);

        test.setNumberOftests(numOfTest);

        for (int i = 0; i < numOfTest; i++) {
            System.out.print("Enter test score " + (i + 1) + ":");
            test.setTestArrayLocation(i, KB.nextDouble());
        }
        try {
            System.out.println(test.Average());
        } catch (IllegalArgumentException ex) {
            System.out.print(ex.getMessage());
        }
    }
}

class TestScore {
    // Setting the arrays
    private double[] testScores;
    private int numberOftests;

    public TestScore(double[] testScores) {
        this.testScores = testScores;
    }

    public double[] getTestScores() {
        return testScores;
    }

    public void setTestScores(double[] testScores) {
        this.testScores = testScores;
    }

    public int getNumberOftests() {
        return numberOftests;
    }

    public void setNumberOftests(int numberOftests) {
        this.numberOftests = numberOftests;
    }

    public void setTestArrayLocation(int i, double score) {
        this.testScores[i] = score;
    }

    public double getTestArrayLocation(int i) {
        return this.testScores[i];
    }

    public double Average() {
        double avg = 0;

        for (int i = 0; i < this.getNumberOftests(); i++) {
            if (this.getTestArrayLocation(i) < 0 || this.getTestArrayLocation(i) > 100) {
                throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.\n");
            } else {
                avg += this.getTestArrayLocation(i);
            }
        }
        return avg /= this.getNumberOftests();
    }
}