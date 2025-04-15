import Publishers.ABC_Server;
import Subscribers.Premium_Subscriber;
import Subscribers.Regular_Subscriber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        ABC_Server abcServer = new ABC_Server();
        int option;
        new Premium_Subscriber(abcServer, "Demo Premium");
        new Regular_Subscriber(abcServer, "Demo Regular");

        while(true) {
            System.out.println("Welcome to ABC Company!!!");
            System.out.println("Previous Server state: "+abcServer.get_Current_State_Name(abcServer.getPrevious_Server_State()));
            System.out.println("Current Server state: "+abcServer.get_Current_State_Name(abcServer.getCurrent_Server_State()));
            System.out.println("Choose any of the following:-");
            System.out.println("1. Change Server State");
            System.out.println("2. Quit");
            System.out.println();

            option = scanner.nextInt();
            if(option == 1) {
                System.out.println();
                System.out.println("Choose any of the following:-");
                System.out.println();
                System.out.println("1. operational");
                System.out.println("2. partially down");
                System.out.println("3. fully down");
                System.out.println();

                option = scanner.nextInt();

                if(option == abcServer.getCurrent_Server_State()) {
                    System.out.println("\n"+"Oops, it's the same state. ");
                    continue;
                }

                if(option==1 || option==2 ||option==3) {
                    abcServer.setCurrent_Server_State(option);
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Invalid state chosen");
                    System.out.println();
                }

            } else if(option == 2) {
                System.out.println();
                System.out.println("Quitting the program");
                break;

            } else {
                System.out.println("\n"+"invalid option given");
            }
        }
    }

}
