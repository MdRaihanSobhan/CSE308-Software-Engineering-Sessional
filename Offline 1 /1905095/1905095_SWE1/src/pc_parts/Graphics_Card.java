package pc_parts;

public class Graphics_Card implements parts{
    private int memory;
    private int price;
    private String name;

    public Graphics_Card() {
        name="Graphics Card";
    }

    public Graphics_Card(int memory) {
        this.memory = memory;
        if(memory==2){
            this.price = 6500;
        }
        else if(memory==4){
            this.price= 7600;
        }
        else{
            this.price= 6500+ 550*(memory-2);
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
        if(memory==2){
            this.price = 6500;
        }
        else if(memory==4){
            this.price= 7600;
        }
        else{
            this.price= 6500+ 550*(memory-2);
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void descriptions() {
        System.out.println("Graphics Card: ");
        System.out.println("Memory "+ memory + " GB");
        System.out.println("Price: BDT "+ this.price + "/=");
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }
}
