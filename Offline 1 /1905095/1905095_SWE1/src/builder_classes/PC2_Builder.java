package builder_classes;

import pc_parts.*;
import products.PC;

public class PC2_Builder extends Pc_builder {

    public PC2_Builder() {
        super();
    }

    @Override
    public void setProcessor() {
        Processor processor= new Processor();
        processor.setPrice(37000);
        processor.setCompany("Intel");
        processor.setModel("Core i7");
        processor.setGeneration(11);

        pc.add(processor);
    }

    @Override
    public void setCooler() {
        Cooler cooler= new Cooler();
        cooler.setType("Liquid");
        cooler.setPrice(17000);
        pc.add(cooler);
    }

}
