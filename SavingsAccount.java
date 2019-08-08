/*
** Assume the existence of a BankAccount class.

Define a subclass, SavingsAccount that contains the following:

a double instance variable, interestRate
a constructor that accepts a parameter of type double which is used to initialize the instance variable
*/


public class SavingsAccount extends BankAccount {
    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
    private  double interestRate;
}