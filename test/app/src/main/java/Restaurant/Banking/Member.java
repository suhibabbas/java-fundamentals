package Restaurant.Banking;

public class Member extends BankMember {
    private final String firstName;
    private final String lastName;
    private final String address;

    public Member(String firstName, String lastName, String address, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.number = number;
    }

    private String number;

    private Account account;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public Account getAccount() {
        return account;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public void applyForLoan(Double loanAmount) {
        System.out.println("I want to borrow => " +loanAmount+ " and use my house ad collateral");
    }
    public void openAccount(Account account){
        this.account =account;
    }
}
