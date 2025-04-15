package Coffeer_Tong;

import Coffee.Coffee;
import Ingredients.*;

import java.util.ArrayList;
import java.util.Scanner;

import static Coffeer_Tong.Coffee_Maker.*;

public class Main {

    public static void main(String[] args) {


        int totalcost=0;
        ArrayList<Coffee> coffeeList = new ArrayList<Coffee>();

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose the type of coffee you want to order: ");
            System.out.println("Enter 1 for Americano");
            System.out.println("Enter 2 for Cappuccino");
            System.out.println("Enter 3 for Espresso");
            System.out.println("Enter 4 for Mocha");
            System.out.println("Enter 5 for Customized Coffee");

            System.out.println("Enter 0 to stop order");
            int n = scanner.nextInt();
            if(n==0){
                break;
            }
            else if(n==1){
                System.out.println("Enter the number of cups : ");
                int m= scanner.nextInt();
                for (int i=1; i<=m; i++){
                    Coffee coffee = new Coffee();
                    coffee = makeAmericano(coffee);
                    coffeeList.add(coffee);
                }
            }
            else if(n==2){
                System.out.println("Enter the number of cups : ");
                int m= scanner.nextInt();
                for (int i=1; i<=m; i++){
                    Coffee coffee = new Coffee();
                    coffee = makeCappuccino(coffee);
                    coffeeList.add(coffee);
                }
            }
            else if(n==3){
                System.out.println("Enter the number of cups : ");
                int m= scanner.nextInt();
                for (int i=1; i<=m; i++){
                    Coffee coffee = new Coffee();
                    coffee = makeEspresso(coffee);
                    coffeeList.add(coffee);
                }
            }
            else if(n==4){
                System.out.println("Enter the number of cups : ");
                int m= scanner.nextInt();
                for (int i=1; i<=m; i++){
                    Coffee coffee = new Coffee();
                    coffee = makeMocha(coffee);
                    coffeeList.add(coffee);
                }
            }

            else if(n==5){
                Coffee coffee = new Coffee();

                System.out.println("Choose the base type : ");
                System.out.println("Enter 1 for Americano");
                System.out.println("Enter 2 for Cappuccino");
                System.out.println("Enter 3 for Espresso");
                System.out.println("Enter 4 for Mocha");
                System.out.println("Enter 5 for Regular Black Coffee");
                System.out.println("Enter 6 for Regular White Coffee");

                int p= scanner.nextInt();
                if(p==1){
                    coffee = makeAmericano(coffee);
                }
                else if(p==2){
                    coffee = makeCappuccino(coffee);
                }
                else if(p==3){
                    coffee = makeEspresso(coffee);
                }
                else if(p==4){
                    coffee = makeMocha(coffee);
                }
                else if(p==5){
                    coffee = makeBlackCoffee(coffee);
                }
                else if(p==6){
                    coffee = makeMilkCoffee(coffee);
                }
                else {
                    System.out.println("Invalid base type, enter again ");
                    continue;
                }


                while (true){
                    System.out.println("Choose the ingredients you want to add to your coffee: ");
                    System.out.println("Enter 1 for Extra Milk, cost 50/=");
                    System.out.println("Enter 2 for Extra Chocolate Sauce, cost 60/=");
                    System.out.println("Enter 3 for Extra Dairy Cream, cost 40/=");
                    System.out.println("Enter 4 for Extra Grinded Coffee Beans, cost 30/=");
                    System.out.println("Enter 5 for Extta Cinnamon Powder, cost 50/=");
                    System.out.println("Enter 0 to finish customizing ");

                    int x = scanner.nextInt();

                    if(x==0){
                        break;
                    }
                    else if(x==1){
                        coffee= new Milk(coffee);
                    }
                    else if(x==2){
                        coffee= new Chocolate_Sauce(coffee);
                    }
                    else if(x==3){
                        coffee= new Dairy_Cream(coffee);
                    }
                    else if(x==4){
                        coffee= new Grinded_Coffee_Beans(coffee);
                    }
                    else if(x==5){
                        coffee= new Cinnamon_Powder(coffee);
                    }
                    else {
                        break;
                    }
                }

                System.out.print("Enter the name of your customized coffee:     ");
                String coffeName= scanner.next();
                coffee.setName(coffeName);
                System.out.println();
                System.out.print("Enter the number of cups for customized type '"+ coffeName + "':  ");
                int cup = scanner.nextInt();
                for(int j=0; j<cup; j++) {
                    coffeeList.add(coffee);
                }
            }
        }

        for (int i=0; i<coffeeList.size();i++){
            System.out.println((i+1) + ". "+ coffeeList.get(i).getName());
            System.out.println("Ingredients : "+ coffeeList.get(i).getIngredients());
            System.out.println("Cost: "+ coffeeList.get(i).getCost()+"/=");
            totalcost+=coffeeList.get(i).getCost();
        }
        System.out.println("Grand total: BDT "+ totalcost+ "/=");
    }
}
