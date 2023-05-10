
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
    Livello0 f0;
    Livello1 f1;
    livello2 f2;
    Livello3 f3;
    int cont=256;
    
    public MyKeyListener(Livello0 f0){
        this.f1=f1;

    }
    
    public MyKeyListener(Livello1 f1){
        this.f3=f3;
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("w");
                        ((JLabel)f1.al.get(cont-25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-25;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("a");
                        ((JLabel)f1.al.get(cont-1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("d");
                        ((JLabel)f1.al.get(cont+1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        ((JLabel)f1.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("s");
                        ((JLabel)f1.al.get(cont+25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+25;
                    }
                }
            }
    
    public MyKeyListener(livello2 f2){
        this.f2=f2;
        timer = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(lvCorrente == 0){
                    
                }
                if(lvCorrente == 1){
                    
                }
                if(lvCorrente == 2){
                    if(x.getKeyCode() == KeyEvent.VK_W){
                        ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("w");
                        ((JLabel)f2.al.get(cont-25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-25;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_A){
                        ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("a");
                        ((JLabel)f2.al.get(cont-1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont-1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_D){
                        ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("d");
                        ((JLabel)f2.al.get(cont+1)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+1;
                    }
                    if(x.getKeyCode() == KeyEvent.VK_S){
                        ((JLabel)f2.al.get(cont)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/erba tagliataLV2-49x49.png"))); // NOI18N  
                        System.out.println("s");
                        ((JLabel)f2.al.get(cont+25)).setIcon(new ImageIcon(getClass().getResource("/immagini livelli/taglia erba.jpg"))); // NOI18N  
                        cont=cont+25;
                    }
                }
                if(lvCorrente == 3){
                    
                }
            }
            });
        
        timer.setRepeats(true);
    }
    
    public MyKeyListener(Livello3 f3){
        this.f3=f3;

    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        x = e;
        timer.start();
                
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        timer.stop();
    }
    
}
