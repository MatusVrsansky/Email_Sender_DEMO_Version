/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pictures;

import java.awt.Toolkit;
import prjForm.Start_Form;

/**
 *
 * @author Matúš
 */
public class NewClass {
    
    public void Set_Icon()
    {
        Start_Form f = new Start_Form();
        
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon-email.png")));
    }

    
}
