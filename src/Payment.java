import OnlineBank.Bkash;
import OnlineBank.Nagad;
import OnlineBank.Rocket;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Order> cart = new ArrayList<Order>();
    Bkash bkash = new Bkash();
    Nagad nagad = new Nagad();
    Rocket rocket = new Rocket();

    public void add(Product product, int quantity) {
        cart.add(new Order(product, quantity));
    }

    public void show() {
        System.out.println("Product name:\tRate\tQuantity\tTotal");
        for (Order order : cart) {
            System.out.println(order.getProduct().getName()
                    + "\t\t\t"
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

    void payment(){
        show();
        System.out.println("___________________________________________________");
        System.out.println("\n\t\t\t\t\tGrand Total: \tBDT " + grandTotal());
        System.out.println("\n\t\t\t\t\tOn Bkash: \t\tBDT "+ bkash.calculateCharge(grandTotal()));
        System.out.println("Online Bank\t\t\tOn Nagad: \t\tBDT "+ nagad.calculateCharge(grandTotal()));
        System.out.println("\t\t\t\t\tOn Bkash: \t\tBDT "+ rocket.calculateCharge(grandTotal()));
    }
}
