import Unit.*;

import java.lang.foreign.SymbolLookup;

public class Main {
    public static void main(String[] args) {
        Arbalesster arbalesster = new Arbalesster("Arbaletchik", "arbalet", 100, 100, 5, 5, 5, 10, 5);
        System.out.println(arbalesster.toString());
        Magician magician = new Magician("Koldun", "magic", 100, 100, 5, 5, 5, 5, 5);
        System.out.println(magician.toString());
        Monk monk = new Monk("Monakh", "prayer", 100, 100, 1, 1, 0, 0, 0);
        System.out.println(monk.toString());
        Outlaw outlaw = new Outlaw("Solovey", "gun", 100, 100, 10, 10, 10, 10, 10);
        System.out.println(outlaw.toString());
        Peasant peasant = new Peasant("Ivan", "pitchfork", 100, 100, 0, 1, 1, 1, 1);
        System.out.println(peasant.toString());
        Sniper sniper = new Sniper("Mozilla", "rifle", 100, 100, 10, 1, 10, 10, 1);
        System.out.println(sniper.toString());
        Spearman spearman = new Spearman("Kopeyshchik", "spear", 100, 100, 10, 10, 5, 5, 5);
        System.out.println(spearman.toString());
    }
}