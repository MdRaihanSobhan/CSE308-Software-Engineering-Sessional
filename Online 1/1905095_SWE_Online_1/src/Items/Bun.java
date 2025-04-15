package Items;

public class Bun implements burger_items{
    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public void descriptions() {
        System.out.println("Bun - 20/=");
    }

    @Override
    public String getName() {
        return "Bun";
    }
}
