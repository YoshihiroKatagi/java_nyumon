package Part1.Chap3;

public class Main {
    public static void main(String[] args) {
        // 3-3
//        int isHungry = 1;
//        String food = "バナナ";
//        System.out.println("こんにちは");
//        if (isHungry == 0) {
//            System.out.println("お腹がいっぱいです");
//        }else {
//            System.out.println("腹ペコです");
//            System.out.println(food + "をいただきます");
//        }
//        System.out.println("ごちそうさまでした");

        // 3-5
//        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
//        int selected = new java.util.Scanner(System.in).nextInt();
//        switch (selected) {
//            case 1:
//                System.out.println("検索します");
//                break;
//            case 2:
//                System.out.println("登録します");
//                break;
//            case 3:
//                System.out.println("削除します");
//                break;
//            case 4:
//                System.out.println("変更します");
//                break;
//        }

        // 3-6
        System.out.println("【数当てゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for (int i=0; i<5; i++) {
            System.out.println("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
