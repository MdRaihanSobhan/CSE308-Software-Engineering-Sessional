package Ingredients;

import Coffee.Coffee;

public class Water extends Decorator {
    Coffee coffee;
    public Water(Coffee coffee){
        this.coffee= coffee;
    }
    public String getIngredients(){
        return coffee.getIngredients() + " , Water ";
    }
    public int getCost(){
        return coffee.getCost();
    }
}
