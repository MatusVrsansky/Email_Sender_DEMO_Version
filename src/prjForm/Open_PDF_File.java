/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjForm;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matúš
 */
public class Open_PDF_File {
    
    public void Open_File()
    {
        if (Desktop.isDesktopSupported()) {
            // File in user working directory, System.getProperty("user.dir");
            File file = new File("Instructions.pdf");
            if (!file.exists()) {
                // In JAR
                InputStream inputStream = ClassLoader.getSystemClassLoader()
                                    .getResourceAsStream("Pictures/Instructions.pdf");
                // Copy file
                OutputStream outputStream = null;
                try {
                    outputStream = new FileOutputStream(file);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Start_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
                byte[] buffer = new byte[1024];
                int length;
                try {
                    while ((length = inputStream.read(buffer)) > 0) {
                        outputStream.write(buffer, 0, length);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Start_Form.class.getName()).log(Level.SEVERE, null, ex);
                } 
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Start_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Start_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                // Open file
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                Logger.getLogger(Start_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // end of code for openning PDF file
    }
    
}
