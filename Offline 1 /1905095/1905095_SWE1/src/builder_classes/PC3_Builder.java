package builder_classes;

import pc_parts.*;
import products.PC;

public class PC3_Builder extends Pc_builder {


    public PC3_Builder() {
        super();
    }

    @Override
    public void setProcessor() {
        Processor processor= new Processor();
        processor.setPrice(65000);
        processor.setCompany("Intel");
        processor.setModel("Core i9");
        processor.setGeneration(11);

        pc.add(processor);
    }

    @Override
    public void setDVD() {
        DVD dvd= new DVD();
        dvd.setPrice(6000);
        pc.add(dvd);
    }
}
