public class Book extends ProductForSale{

    public Book(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void Details() {
        System.out.println("The product type is " + type +
                "; his price is " + price +
                "; his description is + " + description);
    }
}