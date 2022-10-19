package Part3.Chap15;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {

//        // 15-1
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i<100; i++) {
//            sb.append(i+1).append(",");
//        }
//        String s = sb.toString();
//        String[] a = s.split(",");
//        System.out.println(s);
//        System.out.println(a[99]);


        // 15-4
//        Date now = new Date();
//        Calendar c = Calendar.getInstance();
//        c.setTime(now);
//        int day = c.get(Calendar.DAY_OF_MONTH);
//        c.set(Calendar.DAY_OF_MONTH, day + 100);
//        Date future = c.getTime();
//        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
//        String s = f.format(future);
//        System.out.println(s);

        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        String str = future.format(fmt);
        System.out.println(str);

    }

    // 15-2
    String folder = "c:\\abc\\";
    String file = "Readme.txt";
    public String concatPath(String folder, String file) {
        if (!folder.endsWith("\\")) {
            folder += "\\";
        }
        return folder + file;
    }

    // 15-3
    // (1) ".*"
    // (2) "A[0-9][0-9]?" -> "A\d{1,2}"
    // (3) "U[A-Z]{3}

}
