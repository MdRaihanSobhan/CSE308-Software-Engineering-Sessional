package clients;

import builder_classes.*;
import director.Director;
import pc_parts.parts;
import products.PC;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class User {


    public static void printALL(ArrayList<PC> PClist){
        int i=1;
        int cost=0;
        for (PC item : PClist) {
            System.out.println("PC "+ i);
            i++;
            item.show();
            cost+= item.printCost();
        }

        System.out.println("Grand Total: "+ cost);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Q anytime to Quit, O to start an order and E to end an order");


        ArrayList<PC> PCList= new ArrayList<>();


        while (true){
            String input = scanner.next();
            if(input.equalsIgnoreCase("Q")){
                break;
            }
            if(input.equalsIgnoreCase("O")){
                System.out.println("Order Starts");
                System.out.println("Gaming PC?");
                System.out.println("Enter Y for Yes and N for No");
                input= scanner.next();
                int n;
                Director director= new Director();
                Pc_builder normalPC;
                if(input.equalsIgnoreCase("Y")){
                    director= new Director();
                    normalPC = new GamingPC_Builder();
                    director.buildPC(normalPC);
                }
                else {
                    if (input.equalsIgnoreCase("E")) {
                        System.out.println("At least one order should be given, default No is chosen");
                    }

                    System.out.println("Select the type: ");
                    System.out.println("Enter 1 for Core i5, 2 for Core i7, 3 for Core i9");

                    input = scanner.next();
                    if (input.equalsIgnoreCase("1")) {
                        n = 1;
                    } else if (input.equalsIgnoreCase("2")) {
                        n = 2;
                    } else if (input.equalsIgnoreCase("3")) {
                        n = 3;
                    } else {
                        System.out.println("default type 1 is selected");
                        n = 1;
                    }


                    if (n == 1) {

                        normalPC = new PC1_Builder();
                        director.buildPC(normalPC);
                    } else if (n == 2) {

                        normalPC = new PC2_Builder();
                        director.buildPC(normalPC);
                    } else if (n == 3) {
                        normalPC = new PC3_Builder();
                        director.buildPC(normalPC);
                    } else {
                        normalPC = new PC1_Builder();
                        director.buildPC(normalPC);
                    }
                }



                        System.out.println("Add RAM? ");
                        System.out.println("Enter Y for Yes and N for No");
                        input= scanner.next();
                        if(input.equalsIgnoreCase("Y")){
                            System.out.println("Enter 1 for 2666 MHz and 2 for 3200 MHz");
                            input= scanner.next();
                            if(input.equalsIgnoreCase("E")){
                                System.out.println("Can't be ended here");
                                n=1;
                            }
                            else if(input.equalsIgnoreCase("2")){
                                n=2;
                            }
                            else{
                                n=1;
                            }

                            if(n!=1 && n!=2){
                                System.out.println("Wrong input, default model (2666 MHZ) is chosen");
                            }
                            director.setRAM(normalPC, n);
                        }
                        else if (input.equalsIgnoreCase("N")){
                            System.out.println("No RAM Added");
                        }
                        else if (input.equalsIgnoreCase("E")){
                            System.out.println("Order ended");
                            PC pc= normalPC.getPc();
                            PCList.add(pc);
                            continue;
                        }
                        else{
                            System.out.println("No RAM Added");
                        }

                        System.out.println("Add Graphics Card? ");
                        System.out.println("Enter Y for Yes and N for No");
                        input= scanner.next();
                        if(input.equalsIgnoreCase("Y")){
                            System.out.println("Enter 2 for 2 GB and 4 for 4 GB Graphics Card");

                            input= scanner.next();
                            if(input.equalsIgnoreCase("E")){
                                System.out.println("Can't be ended here");
                                n=2;
                            }
                            else if(input.equalsIgnoreCase("4")){
                                n=4;
                            }
                            else{
                                n=2;
                            }


                            director.setGraphics_Card(normalPC, n);
                        }
                        else if(input.equalsIgnoreCase("E")){
                            System.out.println("Order ended");
                            PC pc= normalPC.getPc();
                            PCList.add(pc);
                            continue;
                        }
                        else{
                            System.out.println("No Graphics Card Added");
                        }
                        PC pc= normalPC.getPc();
                        PCList.add(pc);

            }

            System.out.println("Enter O for next order, Q to Quit");
        }
        printALL(PCList);
    }
}
