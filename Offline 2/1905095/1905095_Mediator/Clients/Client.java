package Clients;

import Exam.Bundle;
import Exam.Script;
import Mediators.Controller_Office;

public abstract class Client {
    private Controller_Office controller_office;
    private int client_ID;

    public Client(Controller_Office controller_office, int client_ID) {
        this.controller_office = controller_office;
        this.client_ID = client_ID;
    }

    public Controller_Office getController_office() {
        return controller_office;
    }

    public void setController_office(Controller_Office controller_office) {
        this.controller_office = controller_office;
    }

    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public abstract void getScripts(Bundle bundle);
}
