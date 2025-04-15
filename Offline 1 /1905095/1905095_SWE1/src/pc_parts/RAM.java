package pc_parts;

public class RAM implements parts{
    int price;
    int memory;
    int frequency;

    String name;
    public RAM() {
        name="RAM";
    }


    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
        this.memory=8;
        if(frequency==2666){
            this.price= 2620;
        }
        else if(frequency==3200){
            this.price= 2950;
        }
    }

    @Override
    public void descriptions() {
        System.out.println("RAM: ");
        System.out.println("Memory :"+ this.memory+ " GB");
        System.out.println("Model : DDR4 "+ this.frequency + " MHz");
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }
}
