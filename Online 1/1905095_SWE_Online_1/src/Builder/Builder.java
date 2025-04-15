package Builder;

import Burger.Burger;
import Items.*;

public class Builder extends burger_builder{
    Burger burger= new Burger();
    public void addBun(){
        Bun bun= new Bun();
        burger.add(bun);
    }
    public void addPatty() {
        Patty patty = new Patty();
        burger.add(patty);
    }

    @Override
    public void addCheese() {
        Cheese cheese = new Cheese();
    }

    @Override
    public void addBBQSauce() {
        Bbq_Sauce bbq_sauce= new Bbq_Sauce();
    }

    @Override
    public void addSalad() {
        Salad salad= new Salad();
    }

}
