/**
   This program demonstrates a solution to the
   Project 3.2 SoftwareSales programming challenge.
   "A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
    Quantity	Discount 
    10-19 20%
    20-49 30%
    50-99 40%
    100 or more	50%
    Write a program that asks the user to enter the number of packages purchased. The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount. For instance, to calculate 20% of a value N, you can use the formula:
(   20 / 100.0) * N (or 0.2 * N).""
*/
import java.util.Scanner;
public class SoftwareSales {
    public static void main(String[] args) {
        int number; 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of packages purchased: ");
        number = keyboard.nextInt();
        double unitPrice = 99;
        double discount=0;
        if ((10 <= number) && (number <= 19)){
            discount = .2;
        }
        else if ((20<=number) && (number <=49)){
            discount = .3;
        } 
        else if ((50<=number) && (number <=99)){
            discount = .4;
        }
        else if (100<=number) {
            discount = .5;
        }
        else{
        }
        double discountedPrice = discount * unitPrice * number;
        double total = (1-discount) * unitPrice * number;
        System.out.println("Your discount is: $" + String.format("%.02f", discountedPrice));
        System.out.println("Your total is: $" + String.format("%.02f", total));
    }
    
}