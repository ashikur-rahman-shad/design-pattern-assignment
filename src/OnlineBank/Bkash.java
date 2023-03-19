package OnlineBank;

public class Bkash implements OnlineBank{
    @Override
    public String getName() {
        return "Bkash";
    }

    public double getCharge() {
        return 2.5;
    }
}
