public class Main {
    public static void main(String[] args) {
        //This part is done according to the instructions in the question
        Seller Shamim_Store = new Seller("Walid", "Demra", "88017711728191");
        Customer mohi = new Customer("Mohi", "mohi69@hotmail.com", "Charabag", "01234569");

        Shamim_Store.addProduct("Potato", 12.5);
        Shamim_Store.addProduct("Rice", 14.5);
        Shamim_Store.showProducts();

        System.out.println("\n" + mohi.getName() + "'s cart:\n");
        mohi.cart().add(Shamim_Store.selectProduct(0), 4);
        mohi.cart().add(Shamim_Store.selectProduct(1), 1);
        mohi.cart().payment();


        /*
        But I personally prefer to do it this way, instead of creating an object in the Main class,
        I prefer to call customers and sellers by ID from a Static ArrayList in Customer, Seller Class
        //Like this:

        Seller.add("Walid", "Demra", "88017711728191");

        Seller.no(0).addProduct("Potato", 12.5);
        Seller.no(0).addProduct("Rice", 14.5);
        Seller.no(0).showProducts();

        Customer.add("Mohiuddin", "mohuddin69@hotmail.com", "Charabag", "012344569");

        System.out.println("\n\n" + Customer.no(0).getName() + "'s cart:\n");
        Customer.no(0).cart().add(Seller.no(0).selectProduct(0), 4);
        Customer.no(0).cart().add(Seller.no(0).selectProduct(1), 1);

        Customer.no(0).cart().payment();
         */
    }
}