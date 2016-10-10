/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lasitha Ranawaka
 */
public class Test {

    public static void main(String[] args) {
        try {
             model.db.putData("UPDATE practical_topics set date='2016-10-09' WHERE id='" + 34 + "' AND attendance_practical_id='" +12 + "'");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
