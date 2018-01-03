/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;  

/**
 *
 * @author Matúš
 */
public class Connection_Class {
    
     public Connection getConnection()
    {
        Connection con = null; 
        
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/database_email_users", "root", "");
           //JOptionPane.showMessageDialog(null,"Connected");                                          // some kind of showboxjLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matúš\\Desktop\\coollogo_com-27709557.png")); // NOI18N
           
         //  connection_label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matúš\\Desktop\\ok.png")); // NOI18N
            return con;
            
        } catch(SQLException ex)  
        {
            Logger.getLogger(Start_Form.class.getName()).log(Level.SEVERE,null,ex); 
            //JOptionPane.showMessageDialog(null,"Not Connected");                                     // some kind of showbox
          //  connection_label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matúš\\Desktop\\not_ok.png")); // NOI18N
            return null; 
        }      
    }
    
}
