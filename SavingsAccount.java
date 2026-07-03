public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String accountNo, double opening, double rate) {
        super(accountNo, opening);
        this.rate = rate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}