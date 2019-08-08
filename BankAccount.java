public class BankAccount implements Account{
    public BankAccount(int a) {
        balance = a;
    }
    public int deposit(int a) {
        balance += a;
        return balance;
    }
    public boolean withdraw(int a) {
        if (a<=balance){
            balance -= a;
            return true;
        }
        return false;
    }
    
    private int balance;

}