package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        Account ivanAccount = new Account(59483, "Ivan Logutov", 4500,
                "myemail@bob.com", "(087) 123-4567");

        ivanAccount.withdraw(100.0);

        ivanAccount.deposit(50.0);
        ivanAccount.withdraw(100.0);

        ivanAccount.deposit(51.0);
        ivanAccount.withdraw(100.0);

        System.out.println("\nPhone number: " + ivanAccount.getPhoneNumber()
                + " \nFull name: " + ivanAccount.getCustomerName());

        System.out.println("***********************");

        VipCustomer person1 = new VipCustomer();
        System.out.print(person1.getName());
        System.out.print(" " + person1.getCreditLimit());
        System.out.println(" " + person1.getEmail());

        VipCustomer person2 = new VipCustomer("Bob", 5000);
        System.out.print("\n" + person2.getName());
        System.out.print(" " + person2.getCreditLimit());
        System.out.println(" " + person2.getEmail());

        VipCustomer person3 = new VipCustomer("John", 5000, "john123@gmail.com");
        System.out.print("\n" + person3.getName());
        System.out.print(" " + person3.getCreditLimit());
        System.out.println(" " + person3.getEmail());
    }
}