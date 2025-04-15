import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends Employee{
    int supervisees;
    public ArrayList<Developer> developerList;

    public Manager(String name, String projectName) {
        this.name= name;
        this.projectName =projectName;
        this.role = "Project Manager";
        this.developerList = new ArrayList<Developer>();;
        this.supervisees = 0;
    }

    @Override
    public void showDetails() {
        System.out.println("Name : "+ this.name);
        System.out.println("Role : Project Manager");
        System.out.println("Current Project : "+ this.projectName);
        System.out.println("Number of Supervisees: "+ this.supervisees);
    }

    @Override
    public void add(Component component) {
        Employee employee =(Employee) component;
        employee.setParent(this);
        this.developerList.add((Developer) component);
        this.supervisees++;
    }

    @Override
    public void remove(Component component) {
        if(this.developerList.size()>0) {
            this.developerList.remove(component);
            this.supervisees--;
        }
        else{
            System.out.println("There is no developer working under "+ this.name);
        }
    }

    @Override
    public void showHierarchy() {
        System.out.println("    - "+ this.name + " ("+ this.projectName + ")");
        Iterator iterator =  developerList.iterator();
        while (iterator.hasNext()){
            Component component = (Component) iterator.next();
            component.showHierarchy();
        }
    }

    public void printDeveloperList(){
        for(int i=0; i<developerList.size(); i++){
            developerList.get(i).showDetails();
        }
    }
    @Override
    public void delete() {
        for (int i=0; i<developerList.size(); i++){
            developerList.get(i).delete();
        }
    }
}
