package Factory;

public class TestInfantry {
    public static void main(String[] args) {
        RockHauler grok = new RockHauler(6, 4, 5, 4);
        Musketeer michel = new Musketeer(8, 5, 6, 4);
        SpearThrower buck = new SpearThrower(7, 5, 5, 8);
        CrossbowMan henry = new CrossbowMan(10, 5, 3, 10);


        grok.attack(michel);
        michel.takeDamage();

        while (true){
            if (michel.hits==0) {
                System.out.println("Michel er død"); break;
            }
            if (grok.hits==0){
                System.out.println("Bucky er død"); break;
            }
        }


    }
}
