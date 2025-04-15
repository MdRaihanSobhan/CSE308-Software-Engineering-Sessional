public class Toyota implements Car{
    @Override
    public String getCompany() {
        return "Toyota";
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getCountry() {
        return "Japan";
    }

    @Override
    public String getEngine() {
        return "Hydrogen Fuel Cells Engine";
    }

    @Override
    public String getDriveTrain() {
        return "Rear Wheel";
    }
}
