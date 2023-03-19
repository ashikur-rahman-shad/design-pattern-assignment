import java.util.ArrayList;

public class Seller {
    private String name;
    private String shop_address;
    private String contact_no;
    private ArrayList<Product> productList = new ArrayList<Product>();

    public Seller(String name, String shop_address, String contact_no){
        this.name = name;
        this.shop_address = shop_address;
        this.contact_no = contact_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop_address() {
        return shop_address;
    }

    public void setShop_address(String shop_adress) {
        this.shop_address = shop_adress;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(String name, double price){
        productList.add(productList.size(), new Product(name,price));
    }

    public void setInfo(String name, String shop_address, String contact_no){
        this.name = name;
        this.shop_address = shop_address;
        this.contact_no = contact_no;
    }
    public void showProducts(){
        System.out.println("Products of "+ this.name +":");
        for(int i=0; i<productList.size(); i++){
            System.out.println((i+1) + ". " +
                    productList.get(i).getName() +
                    " : " +
                    productList.get(i).getPrice()
            );
        }
    }
}
