import OnlineBank.Bkash;
import OnlineBank.Nagad;
import OnlineBank.Rocket;

public class Main {
    public static void main(String[] args) {

        Bkash bkash = new Bkash();
        Nagad nagad = new Nagad();
        Rocket rocket = new Rocket();

        Seller.add("Walid", "Demra", "88017711728191");

        Seller.no(0).addProduct("Potato", 12.5);
        Seller.no(0).addProduct("Rice", 14.5);
        Seller.no(0).showProducts();

        Customer.add("Mohiuddin", "mohuddin69@hotmail.com", "Charabag", "012344569");

        System.out.println("\n" + Customer.no(0).getName() + "'s cart:\n");
        Customer.no(0).cart().add(Seller.no(0).selectProduct(0), 4);
        Customer.no(0).cart().add(Seller.no(0).selectProduct(1), 1);
        Customer.no(0).cart().show();

        System.out.println("\nGrand Total: BDT " + Customer.no(0).cart().grandTotal());
        System.out.println("\nOn Bkash: \tBDT "+ bkash.calculateCharge(Customer.no(0).cart().grandTotal()));
        System.out.println("On Nagad: \tBDT "+ nagad.calculateCharge(Customer.no(0).cart().grandTotal()));
        System.out.println("On Bkash: \tBDT "+ rocket.calculateCharge(Customer.no(0).cart().grandTotal()));
    }
}