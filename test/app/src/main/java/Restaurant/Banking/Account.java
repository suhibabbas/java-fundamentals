package Restaurant.Banking;

public class Account implements Savings,Chequing {
    public static final double INTEREST =0.20;

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void save(double amount) {
        balance = balance+ amount;
    }

    @Override
    public void saveWithInterest(Double amount, Double interest) {
        balance = balance + (amount * interest);
    }
}
