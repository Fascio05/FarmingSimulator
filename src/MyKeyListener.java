
import java.awt.event.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author netti
 */
public class MyKeyListener implements KeyListener {

    private Timer timer;
    int lvCorrente = 2;
    KeyEvent x;
    
    public MyKeyListener(){
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 0){
                    
                }
                if(lvCorrente == 1){
                    
                }
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        System.out.println("W");
                    }
                }
                if(lvCorrente == 3){
                    
                }
            }
            });
        timer.setRepeats(true);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        x = e;
        if (e.getKeyCode() == KeyEvent.VK_W) {
            timer.start();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            timer.stop();
        }
    }
    
}
