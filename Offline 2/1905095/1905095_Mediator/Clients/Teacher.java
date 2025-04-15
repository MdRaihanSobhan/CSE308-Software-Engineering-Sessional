package Clients;

import Exam.Bundle;
import Exam.Script;
import Mediators.Controller_Office;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher extends Client{

    Script script;

    public Teacher(Controller_Office controller_office, int client_ID) {
        super(controller_office, client_ID);
    }

    public void submitBundle(List<Script>scripts){
        Random random = new Random();
        List<Integer> marksheet = new ArrayList<>();

        int must_mistake = random.nextInt(scripts.size());
        for(int i=0; i<scripts.size(); i++) {
            if (i == must_mistake) {
                int mark;
                if (must_mistake % 2 == 0) {
                    mark = scripts.get(i).getMarks() - random.nextInt(3) + 3;
                } else {
                    mark = scripts.get(i).getMarks() + random.nextInt(3) - 3;
                }
                marksheet.add(mark);
                continue;
            }

            int randomMistake = random.nextInt(5);
            int mark;
            if (randomMistake % 5 == 2 || randomMistake % 5 == 4) {
                mark = scripts.get(i).getMarks() - random.nextInt(3) + 3;
            }
            else {
                mark = scripts.get(i).getMarks();
            }
            marksheet.add(mark);
        }

        Bundle bundle = new Bundle();
        bundle.scripts= scripts;
        bundle.marksheet= marksheet;
        System.out.println(">>Teacher: Teacher with ID: "+ this.getClient_ID() + " has submitted the scripts and marksheet");
        this.getController_office().send_Bundle(this, bundle);
        return;

    }


    public void recheck(){
        if(script == null) {
            return ;  // operation failed(as no examScript is received yet)
        }

        System.out.println(">>Teacher: Marks before recheck :"+ script.getMarks());

        Bundle bundle = new Bundle();
        List<Script> scripts = new ArrayList<>();

        Random random = new Random();
        int random_Change = random.nextInt(20);

        if(random_Change%4==3){
            script.setMarks(script.getMarks()+random_Change%4);
        }
        else if(random_Change%4==2){
            script.setMarks(script.getMarks()+random_Change%4-1);
        }
        else if(random_Change%4==1){
            script.setMarks(script.getMarks()-random_Change%4);
        }
        else{
        }
        if(script.getMarks()>100){
            script.setMarks(100);
        }



        scripts.add(script);
        bundle.scripts = scripts;

        System.out.println(">>Teacher: Recheck Done by Teacher with id "+this.getClient_ID());
        this.getController_office().send_Recheck_Result(this, bundle);

        return ;
    }
    @Override
    public void getScripts(Bundle bundle) {
        System.out.println(">>Teacher: Teacher with ID : "+ this.getClient_ID()+ " has received the scripts");
        script= bundle.scripts.get(0);

        recheck();
        return ;
    }
}
