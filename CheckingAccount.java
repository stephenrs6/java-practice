public class CheckingAccount extends BankAccount {
    public CheckingAccount(String name, boolean overdraft) {
        super(name);
        this.overdraft = overdraft;
    }

    public boolean hasOverdraft() {
        return overdraft;
    }

    public boolean clearCheck(double amount) {
        if (getBalance() >= amount || overdraft) {
            withdraw(amount);
            return true;
        }
        return false;
    }

    private boolean overdraft;
}