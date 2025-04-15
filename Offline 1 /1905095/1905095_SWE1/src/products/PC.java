package products;

import pc_parts.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class PC {

    private int totalCost;

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    private ArrayList< parts > items;

    public PC() {
        items = new ArrayList<>();
        totalCost=0;
    }

    public void add( parts item ) {
        if (item != null) items.add( item );
    }

    public void show() {
        int i=1;
        for (parts item : items) {
            System.out.println(i+ ".");
            item.descriptions();
            i++;
        }
        System.out.println();
    }

    public int printCost(){

        System.out.println("Cash Memo: ");
        int i=1;
        for (parts item : items) {

            System.out.println(i+ ". "+ item.getName()+ ": " + item.getPrice());
            i++;
            totalCost+=item.getPrice();
        }
        System.out.println("Total cost for this PC : "+ totalCost);
        System.out.println();
        return totalCost;
    }

}
