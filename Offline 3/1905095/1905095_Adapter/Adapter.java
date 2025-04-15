public class Adapter implements Passenger{

    Imposter imposter;

    public Adapter(Imposter imposter) {
        this.imposter = imposter;
    }

    @Override
    public void maintain() {
        this.imposter.damage_Spaceship();
    }

    @Override
    public void study_intersteller() {
        this.imposter.poison_Crewmate();
    }
}
