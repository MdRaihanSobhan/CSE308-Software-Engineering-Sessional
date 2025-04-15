package Subscribers;

import Publishers.ABC_Server;

import java.util.Scanner;

public class Regular_Subscriber extends Subscriber{
    public Regular_Subscriber(ABC_Server abc_server, String name) {
        super(abc_server, name);
    }

    @Override
    public void notify_Subscriber() {
        if(getAbc_server() == null) {
            return ;
        }

        int previous_state = getAbc_server().getPrevious_Server_State();
        int current_state = getAbc_server().getCurrent_Server_State();

        Scanner scanner = new Scanner(System.in);
        String newLine;
        int option;

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println(this+" notified");
        System.out.println();

        // operational to partially down
        if(previous_state==1 && current_state==2) {
            System.out.println("Choose any of the following:-");
            System.out.println("1. Continue using limited functionality from ABC server");
            System.out.println("2. Start receiving service from DEF server with $20 per hour payment");

            System.out.println();

            option = scanner.nextInt();
            newLine = scanner.nextLine();

            if(option == 1) {
                setCurrent_State(2);
            } else if(option == 2) {
                setCurrent_State(3);
            } else {
                System.out.println("Invalid option chosen, choosing to continue using ABC server");
                setCurrent_State(2);
            }

        }

        // set to operational
        else if((previous_state==2 || previous_state==3) && current_state==1) {
            if(getCurrent_State() == 3) {
                System.out.println();
                System.out.println("Total bill for using DEF server : $300");
                System.out.println();
            }
            setCurrent_State(1);
        }
       // partially to fully down
        else if(previous_state==2 && current_state==3) {
            if(getCurrent_State() == 2) {
                System.out.println("Would you like to take service from DEF server with $20 per hour payment?");
                System.out.println("\t"+"1. Yes");
                System.out.println("\t"+"2. No");
                System.out.println();

                option = scanner.nextInt();
                newLine = scanner.nextLine();

                if(option == 1) {
                    setCurrent_State(3);
                } else if(option == 2) {
                    setCurrent_State(4);
                } else {
                    System.out.println();
                    System.out.println("Invalid option given, choosing NO ");
                    System.out.println();
                    setCurrent_State(4);
                }
            }

        }

        // operatinal to fully down
        else if(previous_state==1 && current_state==3) {
            System.out.println();
            System.out.println("Would you like to take service from DEF server with $20 per hour payment?");
            System.out.println("\t"+"1. Yes");
            System.out.println("\t"+"2. No");

            System.out.println();

            option = scanner.nextInt();
            newLine = scanner.nextLine();

            if(option == 1) {
                setCurrent_State(3);
            } else if(option == 2) {
                setCurrent_State(4);
            } else {
                System.out.println();
                System.out.println("\t"+"Invelid option chosen, choosing NO");
                setCurrent_State(4);
            }

        }


        // fully down to partially down
        else if(previous_state==3 && current_state==2) {
            if(getCurrent_State() == 4) {
                System.out.println("Would you like to take service from DEF server with $20 per hour payment?");
                System.out.println("\t"+"1. Yes");
                System.out.println("\t"+"2. No");

                System.out.println();

                option = scanner.nextInt();
                newLine = scanner.nextLine();

                if(option == 1) {
                    setCurrent_State(2);
                } else if(option == 2) {

                } else {
                    System.out.println("\t"+"Invalid option chosen, choosing option NO");
                }
            }

        } else {

        }

        server_Use_Info();

    }

    @Override
    public void server_Use_Info() {
        if(getCurrent_State() == 1) {
            System.out.println();
            System.out.println("You are using ABC server");
            System.out.println();

        } else if(getCurrent_State() == 2) {
            System.out.println();
            System.out.println("You are using limited functionality from ABC server");
            System.out.println();

        } else if(getCurrent_State() == 3) {
            System.out.println();
            System.out.println("Your data copied to DEF server, DEF server running");
            System.out.println();

        } else if(getCurrent_State() == 4) {
            System.out.println();
            System.out.println("Extremely sorry! No service can be provided currently, you will be notified later");
            System.out.println();
        } else {
        }

    }

    @Override
    public String toString() {
        return "Subscriber Name: "+  getName()+ " (Regular Subscriber)";
    }
}
