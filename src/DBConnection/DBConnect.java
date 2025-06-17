/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ITBSS
 */
public class DBConnect {
    Connection c;
    private String username_db = "root";
    private String password_db = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection connect() {
            try {
            Class.forName(this.driver);
            
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos", "root", "");
            
            return this.c;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            return null;
    }

}
