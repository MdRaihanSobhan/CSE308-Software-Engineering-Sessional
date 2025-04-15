package Items;

public class Patty implements burger_items{
    @Override
    public int getPrice() {
        return 80;
    }

    @Override
    public void descriptions() {
        System.out.println("Patty-80/=");
    }

    @Override
    public String getName() {
        return "Patty";
    }
}
