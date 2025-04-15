package Items;

public class Salad implements burger_items{
    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public void descriptions() {
        System.out.println("Salad- 10/=");
    }

    @Override
    public String getName() {
        return "Salad";
    }
}
