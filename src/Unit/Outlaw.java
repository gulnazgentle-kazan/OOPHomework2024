package Unit;

public class Outlaw extends BaseUnit{
    Outlaw(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage, int speedDamage, int range){
        super("Solovey", "gun", 100, 100, 10, 10, 10, 10, 10);
    }
    @Override
    public String toString() {
        return "Соловей";
    }
}
