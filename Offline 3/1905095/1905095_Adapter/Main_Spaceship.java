public class Main_Spaceship {
    public static void main(String[] args) {
        Passenger crewMate = new CrewMate();
        Imposter imposter = new Imposter();
        Passenger adapted_imposter = new Adapter(imposter);

        System.out.println("The passenger: ");
        crewMate.maintain();
        crewMate.study_intersteller();

        System.out.println();

        System.out.println("The imposter: ");
        imposter.damage_Spaceship();
        imposter.poison_Crewmate();

        System.out.println();

        System.out.println("The passenger: ");

        adapted_imposter.maintain();
        adapted_imposter.study_intersteller();
    }
}
