import java.time.Clock;

public class Cheesecake implements PastryShop{

    @Override
    public void name() {
        System.out.println("Cheesecake");
    }

    @Override
    public void price() {
        System.out.println("3$");
    }
}
