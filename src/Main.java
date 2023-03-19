import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Seller.add("Walid","Demra","88017711728191");
        Seller.no(0).addProduct("Potato",12.5);
        Seller.no(0).addProduct("Rice", 14.5);
        Seller.no(0).showProducts();
    }
}