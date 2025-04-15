package Subscribers;

import Publishers.ABC_Server;

import java.util.Scanner;

public class Premium_Subscriber extends Subscriber{
    public Premium_Subscriber(ABC_Server abc_server, String name) {
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
        String newline;
        int option;

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        System.out.println(this+" notified");
        System.out.println();

        // operational to partially down
        if(previous_state==1 && current_state==2) {
            System.out.println("Choose any of the following:-");
            System.out.println("1. use service from two servers (partially from ABC and partially from DEF)");
            System.out.println("2. use service from one server(fully from DEF)");
            System.out.println();

            option = scanner.nextInt();
            newline = scanner.nextLine();

            if(option == 1) {
                setCurrent_State(2);
            } else if(option == 2) {
                setCurrent_State(3);
            } else {
                System.out.println("Invalid option chosen, choosing running using DEF Server only");
                setCurrent_State(3);
            }

        }


        // set to operational

        else if((previous_state==2 || previous_state==3) && current_state==1) {
            setCurrent_State(1);

        }

        // operatinal to fully down

        else if(previous_state==1 && current_state==3) {
            setCurrent_State(3);

        }

        // fully down to partially down
        else if(previous_state==3 && current_state==2) {

        }

        // partially to fully down
        else if(previous_state==2 && current_state==3) {
            if(getCurrent_State() == 2) {
                setCurrent_State(3);
            }

        }

        else {

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
            System.out.println("You are using both ABC and DEF servers");
            System.out.println();

        } else if(getCurrent_State() == 3) {
            System.out.println();
            System.out.println("You are using DEF server");
            System.out.println();

        } else {
        }
    }
    public String toString() {
        return "Subscriber Name: "+ getName()+ " (Premium Subscriber)";
    }
}
