import java.util.ArrayList;
import java.util.Iterator;

public class Company_Composite implements Component{
    public ArrayList<Manager> managerList;
    String name;
    int projects;

    public String getName() {
        return name;
    }

    public Company_Composite(String name) {
        this.managerList = new ArrayList<Manager>();
        this.name = name;
        this.projects = 0;
    }

    @Override
    public void showDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Number of running project : "+ this.projects);
    }

    @Override
    public void add(Component component) {
        Employee employee = (Employee) component;
        employee.setParent(this);
        this.managerList.add((Manager) component);
        this.projects++;
    }

    @Override
    public void remove(Component component) {
        if(this.managerList.size()>0) {
            component.delete();
            this.managerList.remove(component);
            this.projects--;
        }
        else {
            System.out.println("There is no running project under "+ this.name);
        }
    }

    @Override
    public void showHierarchy() {
        System.out.println("- "+ this.name);
        Iterator iterator = managerList.iterator();
        while (iterator.hasNext()){
            Component component = (Component) iterator.next();
            component.showHierarchy();
        }
    }

    @Override
    public void delete() {
        for(int i=0 ;i<managerList.size(); i++){
            this.managerList.get(i).delete();
        }
    }
}
