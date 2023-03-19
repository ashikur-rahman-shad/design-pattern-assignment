package OnlineBank;

public interface OnlineBank {
    String getName();

    double getCharge();

    default double calculateCharge(double amount) {
        return amount + ((amount / 100) * this.getCharge());
    }
}
