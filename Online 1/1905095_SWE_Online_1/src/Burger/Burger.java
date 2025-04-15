package Burger;

import Items.Bun;
import Items.burger_items;

import java.util.ArrayList;

public class Burger {


    private int totalCost;

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    private ArrayList<burger_items> items;

    public Burger() {
        items = new ArrayList<>();
        totalCost=0;
    }

    public void show() {
        int i=1;
        for (burger_items item : items) {
            System.out.println(i+ ".");
            item.descriptions();
            i++;
        }
        System.out.println();
    }

    public int printCost(){

        System.out.println("Cash Memo: ");
        int i=1;
        for (burger_items item : items) {

            System.out.println(i+ ". "+ item.getName()+ ": " + item.getPrice());
            i++;
            totalCost+=item.getPrice();
        }
        System.out.println("Total cost for this Burger : "+ totalCost);
        System.out.println();
        return totalCost;
    }


    public void add( burger_items item ) {
        if (item != null) items.add( item );
    }

}
