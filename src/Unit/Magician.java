package Unit;

public class Magician extends BaseUnit {
    public Magician(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage,
            int speedDamage, int rangeDamage) {
        super(name, "magic", 100, 100, 5, 5, 5, 5, 5);
    }

    @Override
    public String toString() {
        return name;
    }
}
