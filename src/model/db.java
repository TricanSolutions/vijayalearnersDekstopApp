package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class db {

    private static Connection con;

    public static Connection getconn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://tricanlk_test:3306/tricanlk_test1?useUnicode=true&characterEncoding=UTF-8", "tricanlk_test1", "dalbsdms123");
        // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijaya_lerners?useUnicode=true&characterEncoding=UTF-8", "root", "");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijaya_lerners?useUnicode=true&characterEncoding=UTF-8", "root", "123");
//       con = DriverManager.getConnection("jdbc:mysql://mysql1003.mochahost.com:3306/trican_vijayalearners?useUnicode=true&characterEncoding=UTF-8", "trican_vijaya", "tricanlk");
      // con = DriverManager.getConnection("jdbc:mysql://mysql1003.mochahost.com:3306/trican_vijayalearners1?useUnicode=true&characterEncoding=UTF-8", "trican_vijaya", "tricanlk");
//     con = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/vijaya_lerners?useUnicode=true&characterEncoding=UTF-8", "root", "123");
//           con = DriverManager.getConnection("jdbc:mysql://192.168.1.2 :3306/exam_section_system_two?useUnicode=true&characterEncoding=UTF-8", "root","123");
//              con = DriverManager.getConnection("jdbc:mysql://mysql16.000webhost.com/a3584661_pay?useUnicode=true&characterEncoding=UTF-8", "a3584661_root","");
//            con = DriverManager.getConnection("jdbc:mysql://192.168.1.50:3306/pos", "root", "123");
     
//
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void putData(String s) throws SQLException {
        if (con == null) {
            getconn();

            System.out.println(s);
        }
        con.createStatement().executeUpdate(s);

    }

    public static ResultSet getData(String s) throws SQLException {
        if (con == null) {
            getconn();

        }

        return con.createStatement().executeQuery(s);

    }
}
