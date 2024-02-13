package Unit;

public class Sniper extends BaseUnit{
    public Sniper(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage, int speedDamage, int rangeDamage) {
        super("Mozilla", "rifle", 100, 100, 10, 1, 10, 10, 10);
    }
    @Override
    public String toString() {
        return "Мозила";
    }
}
