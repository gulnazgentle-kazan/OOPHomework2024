package Unit;

public class Spearman extends BaseUnit {
    public Spearman(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage,
            int speedDamage, int rangeDamage) {
        super("Kopeyshchik", "spear", 100, 100, 10, 10, 5, 5, 5);
    }

    @Override
    public String toString() {
        return name;
    }
}
