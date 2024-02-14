package Unit;

public class Arbalesster extends BaseUnit {
    public Arbalesster(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage,
            int speedDamage, int rangeDamage) {
        super(name, "arbalet", 100, 100, 5, 5, 5, 10, 5);
    }

    @Override
    public String toString() {
        return name;
    }
}
