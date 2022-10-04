package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer () { this("Default name", 50000.0, "default@gmail.com");
    }

    public VipCustomer (String name, double creditLimit) {
        this(name, creditLimit, "default@gmail.com");
    }
    public VipCustomer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
