package builder_classes;

import pc_parts.Processor;
import products.PC;

public class GamingPC_Builder extends Pc_builder {

    public GamingPC_Builder() {
        super();
    }

    public void setProcessor() {
        Processor processor= new Processor();
        processor.setPrice(28000);
        processor.setCompany("AMD");
        processor.setModel("Ryzen 7 5700X");
        processor.setGeneration(7);

        pc.add(processor);
    }

}
