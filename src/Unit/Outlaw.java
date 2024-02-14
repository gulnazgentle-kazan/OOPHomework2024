package Unit;

public class Outlaw extends BaseUnit {
    public Outlaw(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage,
            int speedDamage, int range) {
        super(name, "gun", 100, 100, 10, 10, 10, 10, 10);
    }

    @Override
    public String toString() {
        return name;
    }
}
