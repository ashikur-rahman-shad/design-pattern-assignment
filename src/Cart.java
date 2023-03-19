import java.util.ArrayList;

public class Cart {
    private ArrayList<Order> cart = new ArrayList<Order>();

    public void add(Product product, int quantity) {
        cart.add(new Order(product, quantity));
    }

    public void show() {
        double grandTotal = 0;
        double total;
        for (Order order : cart) {
            total = order.getProduct().getPrice() * order.getQuantity();
            grandTotal += total;
            System.out.println(order.getProduct().getName()
                    + ":\t"
                    + order.getProduct().getPrice()
                    + "\tx\t"
                    + order.getQuantity()
                    + "\t=\tBDT "
                    + total
            );
        }
        System.out.println("\nGrand Total:\t\t\t=\tBDT " + grandTotal);
    }
}
