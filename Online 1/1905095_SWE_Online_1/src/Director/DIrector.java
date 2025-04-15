package Director;

import Builder.Builder;

public class DIrector {

    public void buildPC(Builder burger_builder){
        burger_builder.addBun();
        burger_builder.addBun();
        burger_builder.addPatty();
    }

    public DIrector() {
    }
}
