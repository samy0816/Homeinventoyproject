/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.inventory.management;

import java.sql.Connection;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class Connectivity {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL ="jdbc:mysql://localhost:33306/InventoryManagement";
    
    final static String USER="root";
    final static String PASS= "";
    
    public static Connection openConnection() throws ClassNotFoundException ,SQLException{
        try{
        Class.forName(JDBC_DRIVER);
        Connection conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        return conn;
    }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
  }
}
           

