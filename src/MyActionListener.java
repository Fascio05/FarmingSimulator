
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author netti
 */
public class MyActionListener implements ActionListener {

    public MyActionListener(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("W");
        //(JLabel)al.get(0)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/acqua.png")));
    }
    
}
