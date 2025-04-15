package pc_parts;

public class Processor implements parts{

    int price;
    String model;
    String company;
    int generation;
    String name;

    public Processor() {
        name="Processor";
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public void descriptions() {
        System.out.println("Processor: ");
        System.out.println("Model : " + this.company+ " "+ this.model);
        System.out.println(this.generation+ "th generation");
        System.out.println("Price: BDT "+ this.price+ "/=");
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }
}
