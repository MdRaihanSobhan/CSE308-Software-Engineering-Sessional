import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Company_Composite> companyList = new ArrayList<Company_Composite>();

        while (true) {
            System.out.println("Enter 1 to add a Company");
            System.out.println("Enter 2 to delete a Company");
            System.out.println("Enter 3 to enter a Company");
            System.out.println("Enter 0 to exit the program");

            int n = scanner.nextInt();
            if(n==0){
                break;
            }
            else if (n == 1) {
                System.out.println("Enter the name of the Company");
                String companyName = scanner.next();

                Company_Composite company = new Company_Composite(companyName);
                companyList.add(company);
                System.out.println("Company Added");
            }

            else if(n==2){
                for(int i=0; i<companyList.size(); i++){
                    System.out.println("Enter "+ (i+1) +" to delete "+ companyList.get(i).getName());
                }
                int m = scanner.nextInt();
                companyList.get(m-1).delete();
                companyList.remove(m-1);
                System.out.println("Company with all projects and developers removed");
            }

            else if(n==3){
                if(companyList.size()<1){
                    System.out.println("There is no company at this moment, please add a company");
                    continue;
                }
                for(int i=0; i<companyList.size(); i++){
                    System.out.println("Enter "+ (i+1) +" to enter "+ companyList.get(i).getName());
                }
                int m = scanner.nextInt();
                Company_Composite company = companyList.get(m-1);

                System.out.println("Company Details: ");
                company.showDetails();
                System.out.println();
                System.out.println("Company Hierarchy: ");
                company.showHierarchy();

                System.out.println("Enter 1 to add a manager/project");
                System.out.println("Enter 2 to remove a manager/project");
                System.out.println("Enter 3 to enter a project");

                int p = scanner.nextInt();
                scanner.nextLine();
                if(p==1){
                    System.out.println("Enter the name of the Project Manager: ");
                    String managerName = scanner.next();
                    System.out.println("Enter the name of the project: ");
                    String projectName = scanner.next();

                    Manager manager = new Manager(managerName,projectName);
                    company.add(manager);

                    System.out.println("Project added");
                }
                else if(p==2){
                    for(int i=0; i<company.managerList.size(); i++){
                        System.out.println("Enter "+ (i+1) +" to remove "+ company.managerList.get(i).getName());
                    }
                    int q = scanner.nextInt();
                    company.remove(company.managerList.get(q-1));
                    System.out.println("Manager with his project and developers removed");
                }
                else if(p==3){
                    if(company.managerList.size()==0){
                        continue;
                    }
                    for(int i=0; i<company.managerList.size(); i++){
                        System.out.println("Enter "+ (i+1) +" to enter "+ company.managerList.get(i).getProjectName());
                    }
                    int q = scanner.nextInt();

                    System.out.println("Manager details");
                    company.managerList.get(q-1).showDetails();
                    System.out.println();
                    System.out.println("Manager hierarchy: ");
                    company.managerList.get(q-1).showHierarchy();

                    System.out.println("Enter 1 to add a developer");
                    System.out.println("Enter 2 to remove a developer");
                    System.out.println("Enter 3 to see details of the developer");

                    int r = scanner.nextInt();
                    Manager manager = company.managerList.get(q-1);
                    if(r==1){
                        System.out.println("Enter the name of the Developer");
                        String developerName = scanner.next();
                        Developer developer = new Developer(developerName, manager.getProjectName());
                        manager.add(developer);
                        System.out.println("Developer added to the project");
                    }
                    else if (r==2){
                        for(int i=0; i<manager.developerList.size(); i++){
                            System.out.println("Enter "+ (i+1) +" to remove "+ manager.developerList.get(i).getName());
                        }
                        int s = scanner.nextInt();
                        manager.remove(manager.developerList.get(s-1));
                        System.out.println("Developer removed");
                    }
                    else if(r==3){
                        for(int i=0; i<manager.developerList.size(); i++){
                            System.out.println("Enter "+ (i+1) +" to see "+ manager.developerList.get(i).getName());
                        }
                        int t = scanner.nextInt();
                        System.out.println("Details of the Developer: ");
                        manager.developerList.get(t-1).showDetails();
                        System.out.println();
                    }
                    else {
                        continue;
                    }
                }
                else{
                    continue;
                }

            }
            else{
                continue;
            }
        }

    }
}
