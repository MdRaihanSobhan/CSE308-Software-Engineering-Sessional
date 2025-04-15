package Clients;

import Exam.Bundle;
import Exam.Script;
import Mediators.Controller_Office;

import java.util.ArrayList;
import java.util.List;

public class Student extends Client{
    private Script script;
    public Student(Controller_Office controller_office, int client_ID) {
        super(controller_office, client_ID);
    }

    public void recheck_Request(){
        if(script == null) {
            return ;
        }

        Bundle bundle = new Bundle();
        List<Script> scripts= new ArrayList<>();

        scripts.add(script);
        bundle.scripts = scripts;

        System.out.println(">>Student: Recheck request sent from student with id "+this.getClient_ID());
        this.getController_office().send_Recheck_Request(this, bundle);

        return ;
    }

    @Override
    public void getScripts(Bundle bundle) {
        System.out.println(">>Student: Student with ID: "+ this.getClient_ID()+ " has received the scripts");
        script = bundle.scripts.get(0);
        System.out.println(script);
        return ;
    }
}