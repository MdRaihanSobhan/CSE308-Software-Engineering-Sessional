package Ingredients;

import Coffee.Coffee;

public class Cinnamon_Powder extends Decorator {
    Coffee coffee;
    public Cinnamon_Powder(Coffee coffee){
        this.coffee= coffee;
    }
    public String getIngredients(){
        return coffee.getIngredients() + " , Cinnamon Powder (50/=)";
    }
    public int getCost(){
        return 50+ coffee.getCost();
    }
}
