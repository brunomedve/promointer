package Utils;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author janai
 */
public class Connection {
    public static java.sql.Connection connect (){
        //Class.forName("org.postgresql.Driver")
        String url = "jdbc:postgresql://localhost:5432/promo_int";

        try {
            return DriverManager.getConnection(url, "svc_promoint", "svc_promoint");
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
}
