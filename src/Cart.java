import java.util.ArrayList;

public class Cart {
    private ArrayList<Order> cart = new ArrayList<Order>();

    public void add(Product product, int quantity) {
        cart.add(new Order(product, quantity));
    }

    public void show() {
        double total;
        for (Order order : cart) {
            System.out.println(order.getProduct().getName()
                    + ":\t"
                    + order.getProduct().getPrice()
                    + "\tx\t"
                    + order.getQuantity()
                    + "\t=\tBDT "
                    + order.getProduct().getPrice() * order.getQuantity()
            );
        }
    }
    double grandTotal(){
        double grandTotal = 0;
        for (Order order : cart) {
            grandTotal += order.getProduct().getPrice() * order.getQuantity();
        }
        return grandTotal;
    }
}
