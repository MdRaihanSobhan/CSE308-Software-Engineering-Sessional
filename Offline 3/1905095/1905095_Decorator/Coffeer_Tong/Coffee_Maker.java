package Coffeer_Tong;

import Coffee.Coffee;
import Ingredients.*;

public class Coffee_Maker {
    public static Coffee makeBlackCoffee(Coffee coffee){
        coffee= new Mug(coffee);
        coffee = new Water(coffee);
        coffee= new Grinded_Coffee_Beans(coffee);
        coffee.setName( "Regular Black Coffee");
        return coffee;
    }
    public static Coffee makeMilkCoffee(Coffee coffee){
        coffee= new Mug(coffee);
        coffee = new Milk(coffee);
        coffee= new Grinded_Coffee_Beans(coffee);
        coffee.setName( "Regular Milk Coffee");
        return coffee;
    }
    public static Coffee makeAmericano(Coffee coffee){
        coffee= makeBlackCoffee(coffee);
        coffee= new Grinded_Coffee_Beans(coffee);
        coffee.setName("Americano");
        return coffee;
    }

    public static Coffee makeCappuccino(Coffee coffee){
        coffee =  makeMilkCoffee(coffee);
        coffee = new Cinnamon_Powder(coffee);
        coffee.setName("Cappuccino");
        return coffee;
    }

    public static Coffee makeMocha(Coffee coffee){
        coffee = makeMilkCoffee(coffee);
        coffee = new Chocolate_Sauce(coffee);
        coffee.setName("Mocha");
        return coffee;
    }

    public static Coffee makeEspresso(Coffee coffee){
        coffee = makeBlackCoffee(coffee);
        coffee = new Dairy_Cream(coffee);
        coffee.setName("Espresso");
        return coffee;
    }
}
