package pc_parts;

public class Cooler implements parts{
    private int price;
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public Cooler() {
        this.name="Cooler";
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getPrice() {
        return this.price ;
    }
    public void setPrice(int price){
        this.price=price;
    }

    @Override
    public void descriptions() {
        System.out.println(this.type+ " Cooler");
        System.out.println("Price: BDT "+ this.price+"/=");
        System.out.println();
    }
}
