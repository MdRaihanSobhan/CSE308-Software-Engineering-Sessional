package director;

import builder_classes.Pc_builder;
import pc_parts.Cooler;
import pc_parts.DVD;
import pc_parts.Graphics_Card;
import pc_parts.RAM;

public class Director{


    public Director() {
    }

    public void buildPC(Pc_builder pc_builder){
        pc_builder.setBasicPats();
        pc_builder.setProcessor();
        pc_builder.setDVD();
        pc_builder.setCooler();
    }

    public void setCooler(Pc_builder pc_builder){
        pc_builder.setCooler();
    }
    public void setGraphics_Card(Pc_builder pc_builder, int memory){
        pc_builder.setGraphics_Card(memory);
    }
    public void setRAM(Pc_builder pc_builder, int type){
        if(type==1 ){
            pc_builder.setRAM(2666);
        }
        else if(type==2){
            pc_builder.setRAM(3200);
        }
        else{
            pc_builder.setRAM(2666);
        }

    }
    public void setDVD(Pc_builder pc_builder){
        pc_builder.setDVD();
    }

}
