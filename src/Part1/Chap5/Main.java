package Part1.Chap5;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("メソッドを呼び出します");
//        hello();
//        System.out.println("メソッドの呼び出しが終わりました");
//    }
//    public static void hello() {
//        System.out.println("こんにちは");
//    }

    // 5-1
//    public static void introduceOneself() {
//        String name = "かたぎ";
//        int age = 26;
//        double height = 171.0;
//        char zodiac = '鼠';
//        System.out.println("My name is " + name);
//        System.out.println("I'm " + age + " year's old, " + height + " and " + zodiac + "年");
//    }
//    public static void main(String[] args) {
//        introduceOneself();
//    }

    // 5-2
//    public static void email(String title, String address, String text) {
//        System.out.println(address + "に、以下のメールを送信しました");
//        System.out.println("件名：" + title);
//        System.out.println("本文：" + text);
//    }
//    public static void main(String[] args) {
//        email("研究引継ぎ", "aaa@gmail.com", "お世話になっております。");
//    }

    // 5-3
//    public static void email(String address, String text) {
//        System.out.println(address + "に、以下のメールを送信しました");
//        System.out.println("件名：無題");
//        System.out.println("本文：" + text);
//    }
//    public static void main(String[] args) {
//        String address = "bbb@gmail.com";
//        String text = "よろしくお願いします。";
//        email(address, text);
//    }

    // 5-4
    public static double calcTriangleArea(double bottom, double height) {
        double ans = bottom * height / 2;
        return ans;
    }
    public static double calcCircleArea(double radius) {
        double ans = radius * radius * 3.14;
        return ans;
    }
    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        double circleArea = calcCircleArea(5.0);
        System.out.println("三角形の面積：" + triangleArea + "円の面積：" + circleArea);
    }
}
