/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizTime.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//Zubaish:1521/xe","onlineexam","students");
            JOptionPane.showMessageDialog(null, "Connected successfully to the DB");
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Cannot connect to the DB");
            ex.printStackTrace();
            System.exit(1);
            
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        try
        {
        conn.close();
         JOptionPane.showMessageDialog(null, "Disconnected successfully to the DB");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Cannot disconnect with the DB");
            ex.printStackTrace();       
            
        }
    }
}

