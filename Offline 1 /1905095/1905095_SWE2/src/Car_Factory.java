public class Car_Factory {
    public Car getCar(String continent){
        if(continent==null)
            return null;
        else if(continent.equalsIgnoreCase("Asia")){
            return new Toyota();
        }
        else if(continent.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        else if(continent.equalsIgnoreCase("North America")){
            return new Tesla();
        }
        {
            return null;
        }
    }
}
