package Unit;

public class Peasant extends BaseUnit {
    public Peasant(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage,
            int speedDamage, int rangeDamage) {
        super(name, "pitchfork", 100, 100, 0, 1, 1, 1, 1);
    }

    @Override
    public String toString() {
        return name;
    }
}
