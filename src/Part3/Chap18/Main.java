package Part3.Chap18;

import java.io.*;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        // code 18-1
//        FileReader fr = new FileReader("data.txt");
//        int input = fr.read();
//        while (input != -1) {
//            System.out.print((char)input);
//            input = fr.read();
//        }
//        fr.close();
//
        // code 18-2
//        FileWriter fw = new FileWriter("data.txt");
//        fw.write('そ');
//        fw.write('れ');
//        fw.write('で');
//        fw.write('は');
//        fw.close();

        // code 18-3
        URL u = new URL("https://book.impress.co.jp/");
        InputStream is = u.openStream();
        int i = is.read();
        while (i != -1) {
            char c = (char)i;
            System.out.print(c);
            i = is.read();
        }
    }
}
