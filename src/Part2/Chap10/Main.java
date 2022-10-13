package Part2.Chap10;

public final class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
        SuperHero sh = new SuperHero();
        sh.run();
        PoisonMatango pm = new PoisonMatango('A');
        pm.attack(h);
    }
}
