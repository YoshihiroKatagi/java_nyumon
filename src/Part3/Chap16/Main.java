package Part3.Chap16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 16-2
//        Hero h1 = new Hero("斎藤");
//        Hero h2 = new Hero("鈴木");
//        List<Hero> heros = new ArrayList<>();
//        heros.add(h1);
//        heros.add(h2);
//        for (Hero h : heros) {
//            System.out.println(h.getName());
//        }

        // 16-3
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");
        Map<String, Integer> heros = new HashMap<>();
        heros.put(h1.getName(), 3);
        heros.put(h2.getName(), 7);
        for(String key : heros.keySet()) {
            int value = heros.get(key);
            System.out.println(key + "が倒した敵=" + value);
        }
    }
}
