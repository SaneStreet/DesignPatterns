package Factory;

public class InfantryUnit {
    public String name;
    public String race;
    public int range;
    public int armor;
    public int hits;
    public int damage;

    //Concstructs infantry
    public InfantryUnit(int range, int armor, int hits, int damage){
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    //Method unit take damage
    public void takeDamage(InfantryUnit unit, int damage){
        int reduction = unit.damage * armor;
        if (damage>reduction){
            hits = hits - (damage - reduction);
        }
    }

    //Method unit attack
    public void attack(InfantryUnit unit){
        if (){

        }
    }

    //Method unit dead
    public void die(InfantryUnit unit){
        if (unit.hits == 0){
            System.out.println(unit.getName() + " has died.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
