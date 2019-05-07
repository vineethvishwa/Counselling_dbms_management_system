/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counselling_dbms;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author d.vineeth
 */
public class Counselling_dbms {

public static Connection getConnection() {
    Connection con = null;
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/kadi","root","089123456789");
        con.setAutoCommit(true);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Connection Problem");
        
    }
    return con;
}
    public static void main(String[] args) {
         // TODO code application logic here
    }
    
}
 
