/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjForm;

import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Matúš
 */
public class Draw_connection_picture {
    
    public JLabel  connection_label;
    
    public boolean Check_connection(Object check)
    {
        connection_label = new JLabel();
        
        if(check != null) 
        {
                    ImageIcon originalIcon = new ImageIcon("ok.png");
                   
                   connection_label.setIcon(originalIcon);
                   return true;
        }
        
        else
        {
                   ImageIcon originalIcon = new ImageIcon("ok.png");
                   
                   connection_label.setIcon(originalIcon);
                   return true;
        }
    }
    
}
