package Ingredients;

import Coffee.Coffee;

public class Chocolate_Sauce extends Decorator {
    Coffee coffee;
    public Chocolate_Sauce(Coffee coffee){
        this.coffee= coffee;
    }
    public String getIngredients(){
        return coffee.getIngredients() + " , Chocolate_Sauce (60/=)";
    }
    public int getCost(){
        return 60 + coffee.getCost();
    }
}
