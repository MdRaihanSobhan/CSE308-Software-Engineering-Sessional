public class Imposter implements Suspicious{

    @Override
    public void damage_Spaceship() {
        System.out.println("Damaging the spaceship");
    }

    @Override
    public void poison_Crewmate() {
        System.out.println("Poisoning the crewmates");
    }
}
