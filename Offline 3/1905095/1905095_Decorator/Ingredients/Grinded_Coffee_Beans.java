package Ingredients;

import Coffee.Coffee;

public class Grinded_Coffee_Beans extends Decorator {
    Coffee coffee;
    public Grinded_Coffee_Beans(Coffee coffee){
        this.coffee= coffee;
    }
    public String getIngredients(){
        return coffee.getIngredients() + " , Grinded Coffee Beans (30/=) ";
    }
    public int getCost(){
        return 30 + coffee.getCost();
    }
}
