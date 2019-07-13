import java.util.Scanner;
/**
   This program demonstrates a solution to the
   Roman Numerals programming challenge.
   "Write a program that asks the user to enter a number within the range of 1 through 10. Use a switch statement to display the Roman numeral version of that number.
    Do not accept a number less than 1 or greater than 10. The output of the program should be just a Roman numeral, such as VII. Your program class should be called RomanNumerals"
*/
public class RomanNumerals {
    public static void main(String[] args) {
        int number; 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number in the range of 1 - 10: ");
        number = keyboard.nextInt();
        switch(number){
            case 1: 
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;
            case 3:
                System.out.print("III");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
                System.out.print("V");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;
            case 10:
                System.out.print("X");
                break;
            default:
                System.out.print("Number not accepted");
        }
    }
    
}