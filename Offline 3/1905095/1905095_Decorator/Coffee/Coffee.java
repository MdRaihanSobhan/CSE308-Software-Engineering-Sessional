package Coffee;

import Ingredients.Grinded_Coffee_Beans;
import Ingredients.Milk;
import Ingredients.Mug;
import Ingredients.Water;

public class Coffee {
    String ingredients;
    String name;
    public Coffee() {
        this.ingredients= "";
        this.name= null;
    }



    public void makeMilkCoffee(Coffee coffee){
        coffee= new Mug(coffee);
        coffee = new Milk(coffee);
        coffee= new Grinded_Coffee_Beans(coffee);
        coffee.setName("Regular Milk Coffee");
    }

    public String getIngredients()
    {
        return ingredients;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost(){
        return 0;
    };
}
