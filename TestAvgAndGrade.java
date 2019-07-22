import java.util.Scanner;

public class TestAvgAndGrade {

    public static double calcAverage(double userScore1, double userScore2, double userScore3, double userScore4,
            double userScore5) {
        double average;
        average = (userScore1 + userScore2 + userScore3 + userScore4 + userScore5) / 5;
        return average;
    }

    public static String determineGrade(double testScore) {

        String letterGrade = " ";

        if (testScore < 60.00) {
            letterGrade = "F";
        } else if (testScore < 70.00 && testScore >= 60.00) {
            letterGrade = "D";
        } else if (testScore < 80.00 && testScore >= 70.00) {
            letterGrade = "C";
        } else if (testScore < 90.00 && testScore >= 80.00) {
            letterGrade = "B";
        } else if (testScore < 100.00 && testScore >= 90.00) {
            letterGrade = "A";
        }
        return letterGrade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfScores = 5;
        double userScore;
        double userScore1 = 0.00;
        double userScore2 = 0.00;
        double userScore3 = 0.00;
        double userScore4 = 0.00;
        double userScore5 = 0.00;

        String outputString = "The letter grades are as follows:\n";

        for (int currentScore = 1; currentScore <= numberOfScores; currentScore++) {
            System.out.print("Enter test grade for student " + currentScore + ": ");
            userScore = scanner.nextDouble();

            switch (currentScore) {
            case 1:
                userScore1 = userScore;
                outputString += "Student 1: " + determineGrade(userScore1) + "\n";
                break;
            case 2:
                userScore2 = userScore;
                outputString += "Student 2: " + determineGrade(userScore2) + "\n";
                break;
            case 3:
                userScore3 = userScore;
                outputString += "Student 3: " + determineGrade(userScore3) + "\n";
                break;
            case 4:
                userScore4 = userScore;
                outputString += "Student 4: " + determineGrade(userScore4) + "\n";
                break;
            case 5:
                userScore5 = userScore;
                outputString += "Student 5: " + determineGrade(userScore5) + "\n";
                break;
            default:
                break;

            }

        }
        System.out.print(outputString);
        System.out.print("The average grade was: " + String.format("%.02f", calcAverage(userScore1, userScore2, userScore3, userScore4, userScore5)));

    }
}