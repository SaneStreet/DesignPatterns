package Factory;

public class HumanInfantryFactory {

    public InfantryUnit createUnit(int techLevel){
        InfantryUnit character;

        switch (techLevel){
            case 100:
                character = new RockHauler(2, 0, 10, 3);
                character.setRace("Human");
                break;
            case 200:
                character = new SpearThrower(5, 3, 15, 5);
                character.setRace("Human");
                break;
            case 300:
                character = new Archer(6, 4, 17, 7);
                character.setRace("Human");
                break;
            case 400:
                character = new CrossbowMan(8, 5, 20, 7);
                character.setRace("Human");
                break;
            case 500:
                character = new Musketeer(9, 6, 20, 10);
                character.setRace("Human");
                break;
            default:
                character = null;
                break;
        }
        return character;
    }
}
