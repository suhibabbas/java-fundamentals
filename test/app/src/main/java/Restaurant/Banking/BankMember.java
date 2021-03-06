package Restaurant.Banking;

public abstract class BankMember {
    public abstract void applyForLoan(Double loanAmount);

    public void withdraw(Account account, double amount){
        double amountWithdrawn = account.checkBalance() - amount;

        System.out.println("withdrew => " + amountWithdrawn );

    }
    public void deposit(Account account,double amount){
        double amountWithdrawn = account.checkBalance() + amount;
        System.out.println("deposited => " +  amountWithdrawn);
    }
}
