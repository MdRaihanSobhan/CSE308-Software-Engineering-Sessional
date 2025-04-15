package Items;

public class Bbq_Sauce implements burger_items{
    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public void descriptions() {
        System.out.println("BBQ Sauce: 20/=");
    }

    @Override
    public String getName() {
        return "BBQ Sauce";
    }
}
