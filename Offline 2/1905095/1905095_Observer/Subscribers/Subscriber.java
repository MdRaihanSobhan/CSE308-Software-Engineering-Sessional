package Subscribers;

import Publishers.ABC_Server;

public abstract class Subscriber {
    private ABC_Server abc_server;
    private int current_State;
    private String name;


    public Subscriber(ABC_Server abc_server, String name) {
        this.abc_server = abc_server;
        this.abc_server.subscribe(this);
        this.current_State = 1;
        this.name = name;
    }

    public ABC_Server getAbc_server() {
        return abc_server;
    }


    public int getCurrent_State() {
        return current_State;
    }

    public void setCurrent_State(int current_State) {
        this.current_State = current_State;
    }

    public String getName() {
        return name;
    }

    public abstract void notify_Subscriber();
    public abstract void server_Use_Info();
}
