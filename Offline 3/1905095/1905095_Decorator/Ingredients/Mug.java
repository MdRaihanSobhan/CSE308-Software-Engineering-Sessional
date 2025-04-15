package Ingredients;

import Coffee.Coffee;

public class Mug extends Decorator {
    Coffee coffee;
    public Mug(Coffee coffee){
        this.coffee= coffee;
    }
    public String getIngredients(){
        return coffee.getIngredients() + "Coffee Mug (100/=)";
    }
    public int getCost(){
        return 100+ coffee.getCost();
    }
}
