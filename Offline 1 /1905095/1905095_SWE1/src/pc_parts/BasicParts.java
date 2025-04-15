package pc_parts;

public class BasicParts implements parts{
    private int price;

    private String name;


    public BasicParts() {
        this.name="Basic Parts";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void descriptions() {
        System.out.println("Basic Parts: ");
        System.out.println("Base Price: "+ this.price);
        System.out.println();
        System.out.println("CPU Casing");
        System.out.println("Lian Li O11 Dynamic XL ROG Certified Full Tower Case");
        System.out.println();
        System.out.println("Motherboard");
        System.out.println("GIGABYTE X570S UD AMD Motherboard");
        System.out.println();
        System.out.println("HDD: 1TB");
        System.out.println();;

    }
}
