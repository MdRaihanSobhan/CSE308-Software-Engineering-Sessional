package builder_classes;

import pc_parts.*;
import products.PC;

public abstract class Pc_builder {
    public PC pc;

    public Pc_builder() {
        this.pc= new PC();
    }

    public abstract void setProcessor();



    public void setCooler(){
        Cooler cooler= new Cooler();
        cooler.setType(null);
        cooler.setPrice(0);
        // pc.add(cooler);
    }
    public void setGraphics_Card(int memory){
        Graphics_Card graphics_card= new Graphics_Card();
        graphics_card.setMemory(memory);
        pc.add(graphics_card);
    }
    public void setRAM(int frequency){
        RAM ram= new RAM();
        ram.setFrequency(frequency);
        pc.add(ram);
    }
    public void setDVD(){
        DVD dvd= new DVD();
        dvd.setPrice(0);
        // pc.add(dvd);
    }

    public void setBasicPats(){
        BasicParts basicParts = new BasicParts();
        basicParts.setPrice(70000);
        pc.add(basicParts);

    }

    public PC getPc() {
        return pc;
    }
}
