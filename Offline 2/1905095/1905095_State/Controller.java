import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Vending_Machine vending_machine = new Vending_Machine(10, 100);
       // System.out.println(vending_machine);

        Scanner scanner= new Scanner(System.in);

        while (vending_machine.getProduct_Count()>0){
            System.out.println(vending_machine);
            System.out.println("Enter Money");
            int n = scanner.nextInt();
            vending_machine.insert_Money(n);

           // System.out.println(vending_machine);
        }

        System.out.println(vending_machine);

    }
}
