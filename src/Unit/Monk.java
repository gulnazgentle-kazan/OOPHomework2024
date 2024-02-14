package Unit;

public class Monk extends BaseUnit {
    public Monk(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage,
            int speedDamage, int rangeDamage) {
        super(name, "prayer", 100, 100, 1, 1, 0, 0, 0);
    }

    @Override
    public String toString() {
        return name;
    }
}
