package Ingredients;

import Coffee.Coffee;

public class Dairy_Cream extends Decorator {
    Coffee coffee;
    public Dairy_Cream(Coffee coffee){
        this.coffee= coffee;
    }
    public String getIngredients(){
        return coffee.getIngredients() + " , Dairy Cream (40/=)";
    }
    public int getCost(){
        return 40 + coffee.getCost();
    }
}
