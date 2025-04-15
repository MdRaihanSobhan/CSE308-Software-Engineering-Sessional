import java.util.Scanner;

public class Orange_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Windoors windoors = new Windoors();
        Linus linus = new Linus();
        Smartphone smartphone;
        Notebook notebook;


        System.out.println("Which operating system do you want to use in your smartphone?");
        System.out.println("Enter 1 for Windoors , and 2 for Linus. Default is Windoors");
        int n = scanner.nextInt();
        if(n==1){
             smartphone = new Smartphone(windoors);
        }
        else if(n==2){
             smartphone = new Smartphone(linus);
        }
        else {
             smartphone = new Smartphone(windoors);
        }

        smartphone.enableCommunicate();
        smartphone.enableInteract();
        smartphone.enableStoreFile();

        System.out.println("Which operating system do you want to use in your Notebook?");
        System.out.println("Enter 1 for Windoors , and 2 for Linus. Default is Windoors");

        n = scanner.nextInt();
        if(n==1){
             notebook = new Notebook(windoors);
        }
        else if(n==2){
             notebook = new Notebook(linus);
        }
        else {
             notebook = new Notebook(windoors);
        }

        notebook.enableCommunicate();
        notebook.enableInteract();
        notebook.enableStoreFile();

        System.out.println("If you want to set the OS of your smartphone, Enter 1 for Windoors , and 2 for Linus");

        n= scanner.nextInt();
        if(n==1){
            smartphone.setOperatingSystem(windoors);
        }
        else if(n==2){
            smartphone.setOperatingSystem(linus);
        }
        else{

        }

        smartphone.enableCommunicate();
        smartphone.enableInteract();
        smartphone.enableStoreFile();

        System.out.println("If you want to set the OS of your notebook, Enter 1 for Windoors , and 2 for Linus");

        n= scanner.nextInt();
        if(n==1){
            notebook.setOperatingSystem(windoors);
        }
        else if(n==2){
            notebook.setOperatingSystem(linus);
        }
        else{

        }

        notebook.enableCommunicate();
        notebook.enableInteract();
        notebook.enableStoreFile();

    }
}
