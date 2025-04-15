package pc_parts;

public class DVD implements parts{

    private int price;

    private String name;

    public DVD() {
        name="DVD";
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void descriptions() {
        System.out.println("DVD: ");
        System.out.println("Price: BDT "+ this.price + "/=");
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }
}
