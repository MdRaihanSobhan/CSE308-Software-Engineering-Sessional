import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class User {
   public static void print(Car car){
        System.out.println("Company: "+ car.getCompany());
        System.out.println("Manufacturer Country: "+ car.getCountry());
        System.out.println("Color: "+ car.getColor());
        System.out.println("Engine: "+car.getEngine());
        System.out.println("Drivetrain System: "+ car.getDriveTrain());
        return ;
    }

    public static void main(String[] args) {
        Car_Factory car_factory= new Car_Factory();
        Scanner scanner= new Scanner(System.in);
        String continent = scanner.nextLine();

        System.out.println("Write the name of your continent: Asia, Europe or North America");
        Car car= car_factory.getCar(continent);
        if(car!=null) {
            print(car);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
