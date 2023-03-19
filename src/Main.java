import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Seller.addSeller("Walid","Demra","88017711728191");
        Seller.list.get(0).addProduct("Potato",12.5);
        Seller.list.get(0).addProduct("Rice", 14.5);
        Seller.list.get(0).showProducts();
    }
}