package Part3.Chap17;

import java.io.IOException;

public class Main {
//    public static void main(String[] args) {

        // 17-2
//        try {
//            String s = null;
//            System.out.println(s.length());
//        }
//        catch(NullPointerException e) {
//            System.out.println("NullPointerException例外をcatchしました");
//            System.out.println("ー－スタックトレース（ここから）ー－");
//            e.printStackTrace();
//            System.out.println("ー－スタックトレース（ここまで）ー－");
//        }

        // 17-3
//        try {
//            int i = Integer.parseInt("三");
//        } catch(NumberFormatException e) {
//            System.out.println("NumberFormatException例外をcatchしました");
//        }

//    }
    public static void main(String[] args) throws IOException {
        System.out.println("プログラムが起動しました");
        throw new IOException();
    }
}
