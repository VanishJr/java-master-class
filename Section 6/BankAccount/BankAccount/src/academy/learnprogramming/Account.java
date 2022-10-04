package academy.learnprogramming;

public class Account {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (int balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber () {
        return this.accountNumber;
    }

    public int getBalance () {
        return this.balance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit (double depositFunds) {
        this.balance += depositFunds ;
        System.out.println("Your withdraw is " + depositFunds + " Your balance is: " + this.balance);
    }

    public void withdraw (double withdrawFunds) {
        if (this.balance - withdrawFunds <= 0) {
            System.out.println("Only this balance " + this.balance + " can be available. Withdraw not processed");
        } else {
            this.balance -= withdrawFunds;
            System.out.println("Your withdraw is " + withdrawFunds + " Your balance is: " + this.balance);
        }
    }

    public Account() {
        System.out.println("Empty constructor");
    }

    public Account (int accountNumber, String customerName, int balance, String email, String phoneNumber ) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called");
    }
}
