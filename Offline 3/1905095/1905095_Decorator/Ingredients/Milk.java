package Ingredients;

import Coffee.Coffee;

public class Milk extends Decorator {
    Coffee coffee;
    public Milk(Coffee coffee){
        this.coffee= coffee;
    }
    public String getIngredients(){
        return coffee.getIngredients() + " , Milk (50/=)";
    }
    public int getCost(){
        return 50 + coffee.getCost();
    }
}
