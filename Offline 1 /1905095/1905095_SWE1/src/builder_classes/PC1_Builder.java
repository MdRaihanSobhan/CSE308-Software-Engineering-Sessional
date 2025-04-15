package builder_classes;

import pc_parts.*;
import products.PC;

public class PC1_Builder extends Pc_builder {

    public PC1_Builder() {
        super();
    }


    @Override
    public void setProcessor() {
        Processor processor= new Processor();
        processor.setPrice(20000);
        processor.setCompany("Intel");
        processor.setModel("Core i5");
        processor.setGeneration(11);

        pc.add(processor);
    }

    @Override
    public void setCooler() {
        Cooler cooler= new Cooler();
        cooler.setType("CPU");
        cooler.setPrice(36000);
        pc.add(cooler);
    }
}
