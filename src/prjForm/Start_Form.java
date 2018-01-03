/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjForm;

import Pictures.NewClass;
import com.sun.glass.ui.Application;
import java.awt.Button;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.Normalizer.Form;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.OutputStream;


/**
 *
 * @author Matúš
 */

public class Start_Form extends javax.swing.JFrame {

    /**
     * Creates new form Start_Form
     */
   public Object connection_check = null;   
   //public JLabel connection_label;
    
    public Start_Form() {
        initComponents();
       // Set_Icon();
       
       
        this.setLocationRelativeTo(null);        // Form will be showed in center of screen
     //   Set_Icon();                             // Set icon of screen
        
        Set_Icon();
        
        
      
       new Thread(this::myBackgroundTask).start();
        
      
        
        
        
       
    }
    
    public void myBackgroundTask()
    {
        Connection_Class c = new Connection_Class(); 
        connection_check = c.getConnection();
        
        Check_connection(connection_check);
    }
   
    
    public void Set_Icon()
    {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon-email.png")));       // ulozit do premennej a poslat cen Constructor
      
    }

    
   
   
    public boolean Check_connection(Object check_connection)
    {
        
        
        if(check_connection != null)
        {
                   //connection_label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matúš\\Desktop\\ok.png")); // NOI18N
                   
                   ImageIcon originalIcon = new ImageIcon("ok.png");
                   
                   connection_label.setIcon(originalIcon);
                   return true;
        }
        
        else
        {
                   //connection_label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matúš\\Desktop\\not_ok.png")); // NOI18N
                   ImageIcon  originalIcon = new ImageIcon("not_ok.png");
                   
                   connection_label.setIcon(originalIcon);
                   return false;
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        login_button = new javax.swing.JLabel();
        register_button = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        connection_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Email_Sender_title.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 43, -1, -1));

        login_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/login.png"))); // NOI18N
        login_button.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                login_buttonMouseMoved(evt);
            }
        });
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 365, -1, -1));

        register_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/register.png"))); // NOI18N
        register_button.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                register_buttonMouseMoved(evt);
            }
        });
        register_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(register_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 205, -1, -1));

        jLabel3.setText("Connection with database: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 482, -1, -1));

        connection_label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                connection_labelMouseMoved(evt);
            }
        });
        connection_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connection_labelMouseClicked(evt);
            }
        });
        getContentPane().add(connection_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, 62, 63));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Alien_Ink_2560X1600_Abstract_Background_1.jpg"))); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_buttonMouseClicked
/*
       Start_Form s = new Start_Form();
       s.dispatchEvent(new WindowEvent(s,WindowEvent.WINDOW_CLOSING));
        
       
       Register_Form f = new Register_Form();
       f.setVisible(true);
        */

        
        setVisible(false);                          // Start Form will disapear
        Register_Form f = new Register_Form();      // Register Form will be showed
       
        
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon-email.png")));
        f.setVisible(true); 
        
        
    }//GEN-LAST:event_register_buttonMouseClicked

    private void register_buttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_buttonMouseMoved
        // TODO add your handling code here:
        
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        register_button.setCursor(c); 
    }//GEN-LAST:event_register_buttonMouseMoved

    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
        // TODO add your handling code here:
        
        setVisible(false);                          // Start Form will disapear
        
        Login_Form f = new Login_Form();      // Register Form will be showed
        
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon-email.png"))); 
        f.setVisible(true); 
    }//GEN-LAST:event_login_buttonMouseClicked

    private void login_buttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseMoved
        // TODO add your handling code here:
        
         
        Cursor c = new Cursor(Cursor.HAND_CURSOR); 
        login_button.setCursor(c); 
    }//GEN-LAST:event_login_buttonMouseMoved

    private void connection_labelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connection_labelMouseMoved
       
        Cursor c = new Cursor(Cursor.HAND_CURSOR); 
        connection_label.setCursor(c); 
    }//GEN-LAST:event_connection_labelMouseMoved

    private void connection_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connection_labelMouseClicked
      
        Open_PDF_File open = new Open_PDF_File(); 
        open.Open_File();
        
    }//GEN-LAST:event_connection_labelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start_Form().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connection_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel login_button;
    private javax.swing.JLabel register_button;
    // End of variables declaration//GEN-END:variables
}
