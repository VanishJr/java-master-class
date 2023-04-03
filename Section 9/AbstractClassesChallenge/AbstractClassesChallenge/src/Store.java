import java.util.ArrayList;

public class Store {

    record OrderItem(int quantity, ProductForSale product) {}

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new Book("art", 99.9, "About the art museum"));
        storeProducts.add(new Laptop("Lenovo", 199.99, "slow"));
        storeProducts.add(new Cups("beautiful", 10.99, "big"));

        listProducts();

        System.out.println("\n Order1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 10, 1);
        addItemToOrder(order1, 20, 0);
        printOrder(order1);
    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.Details();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int quantity, int orderIndex) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order){
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }
}