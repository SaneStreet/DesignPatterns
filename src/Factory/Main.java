package Factory;

public class Main {
    public static void main(String[] args) {
        RockHauler bucky = new RockHauler(10, 6, 5, 4);
        Musketeer michel = new Musketeer(5, 4, 6, 4);
        SpearThrower grok = new SpearThrower(7, 5, 4, 8);
        CrossbowMan henry = new CrossbowMan(10, 5, 3, 10);
    }
}
