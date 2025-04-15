public class Developer extends Employee{

    public Developer(String name, String projectName) {
        this.name = name;
        this.projectName = projectName;
        this.role = "Developer";
    }


    @Override
    public void showDetails() {
        System.out.println("Name : "+ this.name);
        System.out.println("Role : Developer");
        System.out.println("Current Project : "+ this.projectName);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void showHierarchy() {
        System.out.println("        - "+ this.name);
    }

    @Override
    public void delete() {
        this.getParent().remove(this);
    }
}
