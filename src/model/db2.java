/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudaraka Ranasinghe
 */
public class db2 {

    private static Connection con;

    public static Connection getconn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijaya_lerners?useUnicode=true&characterEncoding=UTF-8", "root", "123");
           //con = DriverManager.getConnection("jdbc:mysql://mysql1003.mochahost.com:3306/trican_vijayalearners?useUnicode=true&characterEncoding=UTF-8", "trican_vijaya", "tricanlk");
          // con = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/vijaya_lerners?useUnicode=true&characterEncoding=UTF-8", "root", "123");
            con.setAutoCommit(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return con;
        }
        return con;
    }

    ///////////////////////////////////////////////
    public static void putData(String s) throws SQLException {
        if (con == null) {
            getconn();
        }

        con.createStatement().executeUpdate(s);


    }

    //////////////////////////////////
    public static ResultSet getData(String s) throws SQLException {
        if (con == null) {
            getconn();
        }
        return con.createStatement().executeQuery(s);
    }
    //////////////////////////////////////

    public static java.sql.PreparedStatement getPreparedSatement(String s) throws Exception {

        if (con == null) {
            getconn();
        }

        return getconn().prepareStatement(s);
    }

    //////////////////////////////////////
    public static void executePreparedChange(java.sql.PreparedStatement statement) throws Exception {

        statement.executeUpdate();
    }

    //////////////////////////////////////
    public static ResultSet executePreparedFetch(java.sql.PreparedStatement statement) throws Exception {

        return statement.executeQuery();
    }
}
