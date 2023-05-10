
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
    livello2 f;
    int cont=256;
    
    public MyKeyListener(livello2 f){
        this.f=f;
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 0){
                    
                }
                if(lvCorrente == 1){
                    
                }
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        ((JLabel)f.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("w");
                        ((JLabel)f.al.get(cont-25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-25;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        ((JLabel)f.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("a");
                        ((JLabel)f.al.get(cont-1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        ((JLabel)f.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("d");
                        ((JLabel)f.al.get(cont+1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        ((JLabel)f.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("s");
                        ((JLabel)f.al.get(cont+25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+25;
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
