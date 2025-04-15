public class CrewMate implements Passenger{
    @Override
    public void maintain() {
        System.out.println("Doing basic maintenance");
    }

    @Override
    public void study_intersteller() {
        System.out.println("Studying Intersteller objects");
    }
}
