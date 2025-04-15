public class Tesla implements Car{
    @Override
    public String getCompany() {
        return "Tesla";
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getCountry() {
        return "US";
    }

    @Override
    public String getEngine() {
        return "Electric Engine";
    }

    @Override
    public String getDriveTrain() {
        return "All Wheels";
    }
}
