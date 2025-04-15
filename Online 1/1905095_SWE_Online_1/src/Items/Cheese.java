package Items;

public class Cheese implements burger_items{
    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public void descriptions() {
        System.out.println("Cheese - 30/=");
    }

    @Override
    public String getName() {
        return "Cheese";
    }
}
