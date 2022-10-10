package Part2.Chap9;

public class Hero {
    String name;
    int hp;
    Sword sword;
    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }
}
