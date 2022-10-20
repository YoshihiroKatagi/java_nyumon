package Part3.Chap18;

import java.io.*;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.awt.FlowLayout;
import javax.swing.*;

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

        // code 18-2
//        FileWriter fw = new FileWriter("data.txt");
//        fw.write('そ');
//        fw.write('れ');
//        fw.write('で');
//        fw.write('は');
//        fw.close();

        // code 18-3
//        URL u = new URL("https://book.impress.co.jp/");
//        InputStream is = u.openStream();
//        int i = is.read();
//        while (i != -1) {
//            char c = (char)i;
//            System.out.print(c);
//            i = is.read();
//        }

        // code 18-4
//        Class.forName("org.h2.Driver");
//        String dburl = "jdbc:h2:~/test";
//        String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
//        Connection conn = DriverManager.getConnection(dburl);
//        conn.createStatement().executeUpdate(sql);
//        conn.close();

        // code 18-5
        JFrame frame = new JFrame("はじめてのGUI");
        JLabel label = new JLabel("Hello World!");
        JButton button = new JButton("押してね");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
