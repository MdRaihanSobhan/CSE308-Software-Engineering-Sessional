package Publishers;

import Subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ABC_Server implements Servers{
    private List<Subscriber> subscriberList;
    private int previous_Server_State;  // 1(operational), 2(partially down), 3(fully down)
    private int current_Server_State;

    public ABC_Server() {
        subscriberList = new ArrayList<>();
        current_Server_State = 1;  // operational at the start
    }



    public int getPrevious_Server_State() {
        return previous_Server_State;
    }


    public int getCurrent_Server_State() {
        return current_Server_State;
    }

    public void setCurrent_Server_State(int current_Server_State) {
        this.previous_Server_State = this.current_Server_State;
        this.current_Server_State = current_Server_State;
        notify_All_Subscribers();
    }

    public static String get_Current_State_Name(int state) {
        if(state == 1) {
            return "Operational";
        } else if(state == 2) {
            return "Partially Down";
        } else if(state == 3) {
            return "Fully Down";
        } else {
            return "Invalid State";
        }
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }


    @Override
    public void notify_All_Subscribers() {
        for(Subscriber subscriber: subscriberList) {
            subscriber.notify_Subscriber();
        }
    }
}
