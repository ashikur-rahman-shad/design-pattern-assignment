import java.util.ArrayList;

public class Customer {
    private static ArrayList<Customer> list = new ArrayList<Customer>();

    private Payment payment = new Payment();
    private String name;
    private String email;
    private String address;
    private String contact_no;

    private Customer(String name, String email, String address, String contact_no) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.contact_no = contact_no;
    }

    public static Customer no(int id) {
        return list.get(id);
    }

    public static void add(String name, String email, String address, String contact_no) {
        list.add(new Customer(name, email, address, contact_no));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public Payment cart() {
        return this.payment;
    }

}
